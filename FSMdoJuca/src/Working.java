public class Working extends AbstractState
{
    public Working(Juca juca)
    {
        super(juca);
    }

    @Override
    public void enter()
    {
        System.out.println("\nHora de ir para o trabalho!");
    }

    @Override
    public void execute()
    {
        juca.increaseHuger(2);
        juca.increaseFatigue(5);
        printStats("\nTrabalhando...");

        if (juca.getFatigue() > 50)
        {
            juca.updateState(new Sleeping(juca));
        }
        else if (juca.getHunger() > 10)
        {
            juca.updateState(new Eating(juca));
        }
    }
}
