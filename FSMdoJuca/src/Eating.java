public class Eating extends AbstractState
{
    public Eating(Juca juca)
    {
        super(juca);
    }

    @Override
    public void enter()
    {
        System.out.println("Bateu uma fome...");
    }

    @Override
    public void execute()
    {
        juca.decreaseHunger(5);
        System.out.println("\nComendo...");
        printStats();

        if (juca.getHunger() == 0)
        {
            juca.updateState(new Working(juca));
        }
    }

    @Override
    public void leave()
    {
        System.out.println("Ufa! Já estou cheio...");
    }
}
