public class Juca
{
    AbstractState currentState = new Working(this);

    private int hunger = 0;
    private int fatigue = 0;

    public void doAction()
    {
        currentState.execute();
    }

    public void updateState(AbstractState newState)
    {
        currentState.leave();
        currentState = newState;
        currentState.enter();
    }

    public int getHunger()
    {
        return hunger;
    }

    public int getFatigue()
    {
        return fatigue;
    }

    public void increaseHuger(int value)
    {
        hunger += value;
    }

    public boolean decreaseHunger(int value)
    {
        hunger -= value;
        if (hunger < 0)
        {
            hunger = 0;
            return false;
        }

        return true;
    }

    public void increaseFatigue(int value)
    {
        fatigue += value;
    }

    public boolean decreaseFatigue(int value)
    {
        fatigue -= value;
        if (fatigue < 0)
        {
            fatigue = 0;
            return false;
        }

        return true;
    }
}
