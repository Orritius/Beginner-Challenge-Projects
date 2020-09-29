public class BeginnerChallenges {
    // A place to keep track of the challenges that I solve

    public static void main(String[] args) {
        for (int i = 99; i >= 1; i--){
            if (i > 2){
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall...");
            } else if (i == 2) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around, " + (i - 1) + " bottle of beer on the wall...");
            } else {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down, pass it around, no bottles of beer on the wall...");
            }
        }
    }
}
