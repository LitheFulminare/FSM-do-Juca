public class InspectingAreaC extends AbstractState<PatrolGuard>
{
    public InspectingAreaC(PatrolGuard character)
    {
        super(character);
    }

    @Override
    public void execute()
    {
        character.printStats("Inspecionando a area C");

        if (character.isReturningToEntrance)
        {
            character.isReturningToEntrance = false;
            character.isGoingRight = true;
            character.updateState(new InspectingEntrance(character));
        }
        else
        {
            character.updateState(new InspectingAreaD(character));
        }
    }
}