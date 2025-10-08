public class InspectingCameraA extends AbstractState<CameraGuard>
{
    public InspectingCameraA(CameraGuard cameraGuard)
    {
        super(cameraGuard);
    }

    @Override
    public void enter()
    {
        System.out.println("\nHora de ir para o trabalho!");
    }

    @Override
    public void execute()
    {

    }
}
