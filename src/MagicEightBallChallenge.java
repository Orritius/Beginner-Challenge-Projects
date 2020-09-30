import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MagicEightBallChallenge {


    public void askTheEightBall() {
        String[] responses = {"Yes", "No", "Maybe", "Perhaps", "I am unsure", "Wait another day, then ask again",
                "Cannot predict now", "Most Likely", "Definitely", "You may rely on it", "Almost certainly", "Definitely",
                "Never", "Definitely not"};
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Please enter your question for the eight ball: ");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();

            System.out.println("Thinking...");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            int response = (int) (Math.random() * responses.length);

            System.out.println(responses[response]);

            System.out.println("Would you like to ask another question? Y/N");
            char userResponse = sc.nextLine().charAt(0);

            if (userResponse == 'N' || userResponse == 'n') {
                playAgain = false;
            }

        }
    }
}
