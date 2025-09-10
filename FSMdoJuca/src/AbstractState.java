public abstract class AbstractState implements State
{
    Juca juca;

    public AbstractState(Juca juca)
    {
        this.juca = juca;
    }

    public void printStats()
    {
        System.out.println("Fome: " + juca.getHunger());
        System.out.println("Cansaço: " + juca.getFatigue());
    }
}
