public class Juca
{
    AbstractState currentState = new Eating(this);

    public int hunger = 0;
    public int fatigue = 0;

    public void doAction()
    {
        currentState.execute();
    }
}
