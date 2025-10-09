public interface Character
{
    void update();
    void updateState(AbstractState newState);
    void printStats(String currentStateMessage);
}
