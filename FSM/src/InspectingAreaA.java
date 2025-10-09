public class InspectingAreaA extends AbstractState<PatrolGuard>
{
    public InspectingAreaA(PatrolGuard character)
    {
        super(character);
    }

    @Override
    public void execute()
    {
        character.printStats("Inspecionando a area A");

        if (character.isGoingToAreaB)
        {
            character.updateState(new InspectingAreaB(character));
        }
        else if (character.isReturningToEntrance)
        {
            character.isReturningToEntrance = false;
            character.updateState(new InspectingEntrance(character));
        }
    }
}
