import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        ArrayList<Character> characters = new ArrayList<>();

        CameraGuard cameraGuard = new CameraGuard();
        characters.add(cameraGuard);

        while(true)
        {
            for (Character character : characters)
            {
                character.update();
            }

            Thread.sleep(1000);
        }
    }
}