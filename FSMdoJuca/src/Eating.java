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
        character.increaseHuger(-5);
        character.printStats("\nComendo...");

        if (character.getHunger() == 0)
        {
            character.updateState(new Working(character));
        }
    }

    @Override
    public void leave()
    {
        System.out.println("\nUfa! Já estou cheio...");
    }
}
