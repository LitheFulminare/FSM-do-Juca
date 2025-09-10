public class Eating extends AbstractState
{
    public Eating(Juca juca)
    {
        super(juca);
    }

    @Override
    public void enter()
    {

    }

    @Override
    public void execute()
    {
        juca.decreaseHunger(5);
        System.out.println("Comendo...");
        printStats();
    }

    @Override
    public void leave()
    {

    }
}
