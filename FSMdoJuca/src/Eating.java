public class Eating extends AbstractState<CameraGuard>
{
    public Eating(CameraGuard cameraGuard)
    {
        super(cameraGuard);
    }

    @Override
    public void enter()
    {
        System.out.println("\nBateu uma fome...");
    }

    @Override
    public void execute()
    {
        character.printStats("\nComendo...");
    }

    @Override
    public void leave()
    {
        System.out.println("\nUfa! Já estou cheio...");
    }
}
