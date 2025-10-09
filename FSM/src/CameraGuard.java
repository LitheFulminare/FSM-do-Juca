public class CameraGuard implements Character
{
    AbstractState currentState = new InspectingCameraA(this);

    private int cameraCheckCount = 0;

    public void update()
    {
        System.out.println("\n--- update do CameraGuard ---");
        currentState.execute();
    }

    public void updateState(AbstractState newState)
    {
        currentState.leave();
        currentState = newState;
        currentState.enter();
    }

    public void printStats(String currentStateMessage)
    {
        System.out.println(currentStateMessage);
        System.out.println("Vezes que checou câmera: " + cameraCheckCount);
    }

    public int getCameraCheckCount()
    {
        return cameraCheckCount;
    }

    public void increaseCameraCheckCount()
    {
        cameraCheckCount++;
    }

    public void resetCameraCheckCount()
    {
        cameraCheckCount = 0;
    }
}
