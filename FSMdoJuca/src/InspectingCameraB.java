public class InspectingCameraB extends AbstractState<CameraGuard>
{
    public InspectingCameraB(CameraGuard cameraGuard)
    {
        super(cameraGuard);
    }

    @Override
    public void enter()
    {
        System.out.println("\nMudando para a câmera B");
    }

    @Override
    public void execute()
    {
        character.increaseCameraCheckCount();

        character.printStats("Inspecionando Camera B");

        if (character.getCameraCheckCount() == 3)
        {
            character.resetCameraCheckCount();
            character.updateState(new InspectingCameraA(character));
        }
    }
}
