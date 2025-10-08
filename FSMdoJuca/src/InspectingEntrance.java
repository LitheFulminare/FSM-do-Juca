public class InspectingEntrance extends AbstractState<PatrolGuard>
{
    public InspectingEntrance(PatrolGuard character)
    {
        super(character);
    }

    @Override
    public void execute()
    {
        character.printStats("Inspecionando a entrada");

        if (character.isGoingRight)
        {
            character.updateState(new InspectingAreaA(character));
        }
        else
        {
            character.updateState((new InspectingAreaC(character)));
        }
    }
}
