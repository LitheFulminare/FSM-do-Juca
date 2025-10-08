public class Sleeping extends AbstractState<CameraGuard>
{
    public Sleeping(CameraGuard cameraGuard)
    {
        super(cameraGuard);
    }

    @Override
    public void enter()
    {
        System.out.println("\nBateu um sono...");
    }

    @Override
    public void execute()
    {
        character.printStats("\nDormindo...");
    }
}
