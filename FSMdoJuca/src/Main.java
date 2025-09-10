public class Main
{
    enum States
    {
        WORKING,
        EATING,
        SLEEPING
    }

    static States currentState = States.WORKING;

    static int hunger = 0;
    static int fatigue = 0;

    public static void main(String[] args) {
        boolean isLoopActive = true;

        while(isLoopActive)
        {
            checkState(currentState);
        }
    }

    public static void checkState(States state) {
        switch (state)
        {
            case WORKING:
                work();
                break;
            case EATING:
                eat();
                break;
            case SLEEPING:
                sleep();
                break;
        }

        try { Thread.sleep(1000); }
        catch (InterruptedException e) { throw new RuntimeException(e); }
    }

    public static void work()
    {
        hunger += 2;
        fatigue += 5;

        System.out.println("\nTrabalhando...");
        System.out.println("Fome: " + hunger);
        System.out.println("Cansaço: " + fatigue);

        if (fatigue > 50)
        {
            System.out.println("\nBateu um sono...");
            currentState = States.SLEEPING;
        }
        else if (hunger > 10)
        {
            System.out.println("\nBateu uma fome...");
            currentState = States.EATING;
        }
    }

    public static void eat()
    {
        hunger -= 5;
        if (hunger < 0)
        {
            hunger = 0;
        }

        System.out.println("\nComendo...");
        System.out.println("Fome: " + hunger);
        System.out.println("Cansaço: " + fatigue);

        if (hunger == 0)
        {
            System.out.println("\nUfa! já estou cheio...");

            System.out.println("\nHora de ir para o trabalho!");
            currentState = States.WORKING;
        }
    }

    public static void sleep()
    {
        hunger += 1;
        fatigue -= 10;
        if (fatigue < 0)
        {
            fatigue = 0;
        }

        System.out.println("\nDormindo...");
        System.out.println("Fome: " + hunger);
        System.out.println("Cansaço: " + fatigue);

        if (fatigue > 0)
        {
            return;
        }

        if (hunger <= 10)
        {
            System.out.println("\nHora de ir para o trabalho!");
            currentState = States.WORKING;
        }
        else
        {
            System.out.println("\nBateu uma fome...");
            currentState = States.EATING;
        }
    }
}