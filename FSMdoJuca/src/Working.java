public class Working extends AbstractState<CameraGuard>
{
    public Working(CameraGuard cameraGuard)
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
        character.increaseHuger(2);
        character.increaseFatigue(5);
        character.printStats("\nTrabalhando...");

        if (character.getFatigue() > 50)
        {
            character.updateState(new Sleeping(character));
        }
        else if (character.getHunger() > 10)
        {
            character.updateState(new Eating(character));
        }
    }
}
