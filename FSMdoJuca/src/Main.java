public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Juca juca = new Juca();

        boolean isLoopActive = true;
        while(isLoopActive)
        {
            juca.doAction();

            Thread.sleep(1000);
        }
    }
}