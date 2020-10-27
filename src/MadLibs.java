import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class MadLibs {
    /**
     * Madlibs story taken from image located at: https://tinyurl.com/y5odwcuk
     */

    public static void createAdlib(){
        System.out.println("Please enter the following information, separated by commas when multiple words are needed");
        Scanner sc = new Scanner(System.in);
        System.out.println("Two adjectives: ");
        String[] adjectives = sc.nextLine().split(",");

        System.out.println("A type of bird");
        String birdType = sc.nextLine();

        System.out.println("A room in a house");
        String roomInHouse = sc.nextLine();

        System.out.println("A past tense verb");
        String pastTenseVerb = sc.nextLine();

        System.out.println("A present tense verb");
        String presentTenseVerb = sc.nextLine();

        System.out.println("A relative's name!");
        String relativeName = sc.nextLine();

        System.out.println("Finally, a noun");
        String noun = sc.nextLine();

        try{
            System.out.println("It was a " + adjectives[0] + ", cold November day. I woke up to the " + adjectives[1] +
                    " smell of " + birdType + " roasting in the " + roomInHouse + " downstairs. I " + pastTenseVerb +
                    " down the stairs to see if I could help " + presentTenseVerb + " the dinner. \n My mum said, \"See if " +
                    relativeName + " needs a fresh " + noun + "\"");
            sc.close();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter the adjectives, separated by a comma");
            sc.close();
        }
    }
}
