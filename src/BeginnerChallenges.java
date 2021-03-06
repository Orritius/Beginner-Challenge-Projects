import java.util.ArrayList;

public class BeginnerChallenges {
    // A place to keep track of the challenges that I solve

    public static void main(String[] args) {
        BeginnerChallenges bc = new BeginnerChallenges();
        bc.bottlesOfBeer();
        System.out.println(bc.isArmstrong(1634));
        System.out.println(bc.isArmstrong(256));
        System.out.println(bc.isArmstrong(371));

        System.out.println("Pythagorean Triple checker output:");
        System.out.println(bc.isPythagoreanTriple(3, 4, 5));
        System.out.println(bc.isPythagoreanTriple(5, 3, 4));
        System.out.println(bc.isPythagoreanTriple(4, 5, 3));
        System.out.println(bc.isPythagoreanTriple(13, 84, 85));

        
        new MagicEightBallChallenge();
        
        RockPaperScissors rps = new RockPaperScissors();
        rps.startGame();
        
        CoinEstimator.numOfWrappersAndCoins(new BigDecimal("587.50"), new BigDecimal("960"),
                new BigDecimal("222.264"), new BigDecimal("250.515"));
        
        MadLibs.createAdlib();
    }

    /**
     * bottles of beer song challenge
     */
    private void bottlesOfBeer(){
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

    /**
     * Check if the number is an armstrong number challenge
     * @param theNumber
     * @return true if the number is an Armstrong number, false otherwise
     */
    private boolean isArmstrong(int theNumber){
        // Getting the size of the number by using a String's length
        String theNumberString = Integer.toString(theNumber);
        int numberSize = theNumberString.length();

        // Adding each individual number to a String List.
        ArrayList<String> charsStringArray = new ArrayList<>();

        for (int i = 0; i < theNumberString.length(); i++){
            charsStringArray.add(theNumberString.substring(i, i+1));
        }

        /* For each number in the number string, change it to int and use pow to calculate the number to the power of
        *  the size of the number given as the argument.
        */
        int armstrongCalculation = 0;

        for (String numberString : charsStringArray){
            armstrongCalculation += (Math.pow(Integer.parseInt(numberString), numberSize));
        }

        /* Finally, if the sum of each number multiplied by the length of the number is equal to the initial number
        *  return true, else false.
         */
        return armstrongCalculation == theNumber;
    }
    /**
     * Pythagorean triples checker challenge
     * @param a
     * @param b
     * @param c
     * @return true if the triangle is a Pythagorean triple, false otherwise
     */
    private boolean isPythagoreanTriple(int a, int b, int c){
        int hypotenuse;

        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("All integers must be positive");
        }

        if (a > b && a > c){
            hypotenuse = a;
        } else if (b > c)
            hypotenuse = b;
        else
            hypotenuse = c;

        ArrayList<Integer> oppositeAndAdjacentAngles = new ArrayList<>();

        if (a != hypotenuse){
            oppositeAndAdjacentAngles.add(a);
        }
        if (b != hypotenuse){
            oppositeAndAdjacentAngles.add(b);
        }
        if (c != hypotenuse){
            oppositeAndAdjacentAngles.add(c);
        }

        return (Math.pow(oppositeAndAdjacentAngles.get(0), 2)) + (Math.pow(oppositeAndAdjacentAngles.get(1), 2))
                == (Math.pow(hypotenuse, 2));
    }
}
