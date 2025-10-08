public class PatrolGuard implements Character
{
    AbstractState currentState = new InspectingEntrance(this);

    //private int timesChecked = 0;

    protected boolean isGoingRight = true;
    protected boolean isReturningToEntrance = false;

    @Override
    public void update()
    {
        System.out.println("\n--- update do PatrolGuard ---");
        currentState.execute();
    }

    @Override
    public void updateState(AbstractState newState)
    {
        currentState.leave();
        currentState = newState;
        currentState.enter();
    }

    @Override
    public void printStats(String currentStateMessage)
    {
        System.out.println(currentStateMessage);
    }

    // Seria utilizado pro guarda ficar mais de 1 tick no estado, mas provavelmente não vai ser assim
    /*
    public int getTimesChecked()
    {
        return timesChecked;
    }

    public void increaseTimesChecked()
    {
        timesChecked++;
    }*/
}
