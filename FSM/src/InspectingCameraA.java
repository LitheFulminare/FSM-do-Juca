public class InspectingCameraA extends AbstractState<CameraGuard>
{
    public InspectingCameraA(CameraGuard cameraGuard)
    {
        super(cameraGuard);
    }

    @Override
    public void enter()
    {
        System.out.println("\nMudando para a câmera A");
    }

    @Override
    public void execute()
    {
        character.increaseCameraCheckCount();

        character.printStats("Inspecionando Camera A");

        if (character.getCameraCheckCount() == 3)
        {
            character.resetCameraCheckCount();
            character.updateState(new InspectingCameraB(character));
        }
    }
}
