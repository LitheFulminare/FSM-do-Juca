public abstract class AbstractState implements State
{
    protected Juca juca;

    public AbstractState(Juca juca)
    {
        this.juca = juca;
    }

    public void printStats(String currentStateMessage)
    {
        System.out.println(currentStateMessage);
        System.out.println("Fome: " + juca.getHunger());
        System.out.println("Cansaço: " + juca.getFatigue());
    }

    public void enter()
    {

    }

    public void leave()
    {

    }
}
