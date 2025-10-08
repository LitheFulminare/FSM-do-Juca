public class PatrolGuard implements Character
{
    AbstractState currentState;

    @Override
    public void update()
    {

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

    }
}
