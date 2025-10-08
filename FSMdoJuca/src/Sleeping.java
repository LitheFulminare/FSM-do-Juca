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
        character.increaseHuger(1);
        character.increaseFatigue(-10);
        character.printStats("\nDormindo...");

        if (character.getFatigue() > 0) return;

        if (character.getHunger() <= 10)
        {
            character.updateState(new Working(character));
        }
        else
        {
            character.updateState(new Eating(character));
        }
    }
}
