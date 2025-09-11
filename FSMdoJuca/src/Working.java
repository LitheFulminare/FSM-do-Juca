public class Working extends AbstractState
{
    public Working(Juca juca)
    {
        super(juca);
    }

    @Override
    public void enter()
    {
        System.out.println("Hora de ir para o trabalho!");
    }

    @Override
    public void execute()
    {
        juca.increaseHuger(2);
        juca.increaseFatigue(5);
        System.out.println("Trabalhando...");
        printStats();
    }

    @Override
    public void leave()
    {

    }
}
