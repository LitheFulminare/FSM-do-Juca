public class Sleeping extends  AbstractState
{
    public Sleeping(Juca juca)
    {
        super(juca);
    }

    @Override
    public void enter()
    {
        System.out.println("\nBateu um sono...");
    }

    @Override
    public void execute()
    {
        juca.increaseHuger(1);
        juca.increaseFatigue(-10);
        juca.printStats("\nDormindo...");

        if (juca.getFatigue() > 0) return;

        if (juca.getHunger() <= 10)
        {
            juca.updateState(new Working(juca));
        }
        else
        {
            juca.updateState(new Eating(juca));
        }
    }
}
