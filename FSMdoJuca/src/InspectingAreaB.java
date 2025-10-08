public class InspectingAreaB extends AbstractState<PatrolGuard>
{
    public InspectingAreaB(PatrolGuard character)
    {
        super(character);
    }

    @Override
    public void execute()
    {
        character.printStats("Inspecionando a area B");
        character.isGoingRight = false;
        character.isReturningToEntrance = true;
        character.updateState(new InspectingAreaA(character));
    }

    @Override
    public void leave()
    {
        System.out.println("Voltando para a entrada");
    }
}