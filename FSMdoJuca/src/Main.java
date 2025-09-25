public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Juca juca = new Juca();

        while(true)
        {
            juca.update();

            Thread.sleep(1000);
        }
    }
}