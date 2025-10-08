public class CameraGuard implements Character
{
    AbstractState currentState = new InspectingCameraA(this);

    public void update()
    {
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
        //System.out.println("Fome: " + hunger);
        //System.out.println("Cansaço: " + fatigue);
    }
}
