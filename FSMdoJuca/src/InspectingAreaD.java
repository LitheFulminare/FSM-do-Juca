public class InspectingAreaD extends AbstractState<PatrolGuard>
{
    public InspectingAreaD(PatrolGuard character)
    {
        super(character);
    }

    @Override
    public void execute()
    {
        character.printStats("Inspecionando a area D");
        character.isReturningToEntrance = true;
        character.updateState(new InspectingAreaC(character));
    }

    @Override
    public void leave()
    {
        System.out.println("Voltando para a entrada");
    }
}
