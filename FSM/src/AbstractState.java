public abstract class AbstractState<C> implements State<C>
{
    protected C character;

    public AbstractState(C character)
    {
        this.character = character;
    }

    public void enter()
    {

    }

    public void leave()
    {

    }
}
