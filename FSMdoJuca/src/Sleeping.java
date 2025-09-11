public class Sleeping extends  AbstractState
{
    public Sleeping(Juca juca)
    {
        super(juca);
    }

    @Override
    public void enter()
    {
        System.out.println("Bateu um sono...");
    }

    @Override
    public void execute()
    {
        juca.increaseHuger(1);
        juca.decreaseFatigue(10);
        System.out.println("Dormindo...");
        printStats();
    }

    @Override
    public void leave()
    {

    }
}
