public class CameraGuard implements Character
{
    AbstractState currentState = new Working(this);

    private int hunger = 0;
    private int fatigue = 0;

    public void update()
    {
        currentState.execute();
    }

    public void updateState(AbstractState newState)
    {
        currentState.leave();
        currentState = newState;
        currentState.enter();
    }

    public void printStats(String currentStateMessage)
    {
        System.out.println(currentStateMessage);
        System.out.println("Fome: " + hunger);
        System.out.println("Cansaço: " + fatigue);
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
        if (hunger < 0)
        {
            hunger = 0;
        }
    }

    public void increaseFatigue(int value)
    {
        fatigue += value;
        if (fatigue < 0)
        {
            fatigue = 0;
        }
    }
}
