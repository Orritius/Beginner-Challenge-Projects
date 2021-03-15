import java.util.Scanner;

public class HigherLowerGame {

    //TODO create gui
    public static void beginGame(){
        int randNumber = (int) (Math.random() * 101);
        boolean isCorrect = false;
        Scanner sc = new Scanner(System.in);

        while(!isCorrect){
            System.out.println("Please enter your guess: ");
            int userGuess = sc.nextInt();
            String output = (userGuess > randNumber) ? "Too High" : (userGuess < randNumber) ? "Too Low" : "Correct!";

            if (output.equals("Correct!")){
                System.out.println(output);
                isCorrect = true;
                sc.close();
            } else {
                System.out.println(output);
            }
        }
    }
}
