public class Main
{
    enum States
    {
        WORKING,
        EATING,
        SLEEPING
    }

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
                break;
            case EATING:
                break;
            case SLEEPING:
                break;
        }
    }
}