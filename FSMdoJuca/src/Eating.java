public class Eating extends AbstractState
{
    public Eating(Juca juca)
    {
        super(juca);
    }

    @Override
    public void enter()
    {
        System.out.println("\nBateu uma fome...");
    }

    @Override
    public void execute()
    {
        juca.increaseHuger(-5);
        juca.printStats("\nComendo...");

        if (juca.getHunger() == 0)
        {
            juca.updateState(new Working(juca));
        }
    }

    @Override
    public void leave()
    {
        System.out.println("\nUfa! Já estou cheio...");
    }
}
