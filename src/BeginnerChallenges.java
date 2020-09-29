import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

import java.util.ArrayList;

public class BeginnerChallenges {
    // A place to keep track of the challenges that I solve

    public static void main(String[] args) {
        BeginnerChallenges bc = new BeginnerChallenges();
        bc.bottlesOfBeer();
        System.out.println(bc.isArmstrong(1634));
        System.out.println(bc.isArmstrong(256));
        System.out.println(bc.isArmstrong(371));
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
        if (armstrongCalculation == theNumber){
            return true;
        } else
            return false;
    }
}
