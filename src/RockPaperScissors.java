import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    /**
     * Rock-Paper-Scissors game //TODO Needs to check user input at Y/N to deny invalid inputs.
     */
    public void startGame(){
        String[] moveList = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        int currentUserScore = 0;
        int currentComputerScore = 0;

        while (playAgain){
            System.out.println("Choose your move: Rock/Paper/Scissors");
            Scanner sc = new Scanner(System.in);

            String userChoice = sc.nextLine().toLowerCase();

            if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors") ){
                int computerChoiceIndex = new Random().nextInt(moveList.length);
                String computerChoice = moveList[computerChoiceIndex];
                System.out.println("Your choice was: " + userChoice);
                System.out.println("The computer has chosen: " + computerChoice);

                if (userChoice.equals(computerChoice)){
                    System.out.println("It's a draw!");
                } else if (userChoice.equals("rock") && computerChoice.equals("scissors") || userChoice.equals("paper")
                        && computerChoice.equals("rock") || userChoice.equals("scissors") && computerChoice.equals("paper")){
                    System.out.println("You have won!");
                    currentUserScore += 1;
                } else {
                    System.out.println("The computer wins!");
                    currentComputerScore += 1;
                }
                System.out.println("The current score is: User " + currentUserScore + " Computer " + currentComputerScore);
                System.out.println("Would you like to play again? Y/N");
                char userResponse = sc.nextLine().toLowerCase().charAt(0);
                if (userResponse == 'n'){
                    System.out.println("Exiting game");
                    playAgain = false;
                } else {
                    System.out.println("Setting up another game!");
                }
            } else {
                System.out.println("Please enter a valid choice");
            }
        }
    }
}
