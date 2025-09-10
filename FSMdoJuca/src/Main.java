public class Main
{
    enum States
    {
        WORKING,
        EATING,
        SLEEPING
    }

    static int hunger = 0;
    static int fatigue = 0;

    public static void main(String[] args)
    {
        States currentState = States.WORKING;

        boolean isLoopActive = true;

        while(isLoopActive)
        {
            checkState(currentState);
        }
    }

    public static void checkState(States state)
    {
        switch (state)
        {
            case WORKING:
                work();
                break;
            case EATING:
                eat();
                break;
            case SLEEPING:
                sleep();
                break;
        }
    }

    public static void work()
    {
        hunger += 2;
        fatigue += 5;
    }

    public static void eat()
    {
        hunger -= 5;
        if (hunger > 0)
        {
            hunger = 0;
        }
    }

    public static void sleep()
    {
        hunger += 1;
        fatigue -= 10;
    }
}