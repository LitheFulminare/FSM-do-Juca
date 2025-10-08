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
            for (int i = 0; i < characters.size(); i++)
            {
                characters.get(i).update();
            }

            Thread.sleep(1000);
        }
    }
}