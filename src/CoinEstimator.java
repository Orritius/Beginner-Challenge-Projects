import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class CoinEstimator {

    /**
     * Takes the weight of each coin in grams and then calculates:
     * - The number of coins that the person has in their possession.
     * - The number of coin wrappers needed
     * - The estimated total value of each coin type
     * The weights are taken from the newest minting of each coin type
     * @param penny
     * @param nickel
     * @param dime
     * @param quarter
     */
    //TODO Simplify all print statements into one for each currency type!
    public static void numOfWrappersAndCoins(BigDecimal penny, BigDecimal nickel, BigDecimal dime, BigDecimal quarter){
        // Find the approximate number of each individual coin type
        BigDecimal numOfPennies = penny.divide(new BigDecimal("2.50"), RoundingMode.FLOOR);
        BigDecimal numOfNickels = nickel.divide(new BigDecimal("5"), RoundingMode.FLOOR);
        BigDecimal numOfDimes = dime.divide(new BigDecimal("2.268"), RoundingMode.FLOOR);
        BigDecimal numOfQuarters = quarter.divide(new BigDecimal("5.670"), RoundingMode.FLOOR);

        /* Find the number of wrappers needed to hold each coin type, num of wrappers is always rounded up, even if the
        last wrapper would be left with some empty space.
         */
        BigDecimal numOfPennyWrappers = numOfPennies.divide(new BigDecimal("50"), 0, RoundingMode.CEILING);
        BigDecimal numOfNickelWrappers = numOfNickels.divide(new BigDecimal("40"),0, RoundingMode.CEILING);
        BigDecimal numOfDimeWrappers =  numOfDimes.divide(new BigDecimal("50"), 0, RoundingMode.CEILING);
        BigDecimal numOfQuarterWrappers = numOfQuarters.divide(new BigDecimal("40"), 0, RoundingMode.CEILING);

        // Find total estimated value of each coin type
        BigDecimal penniesTotalValue = numOfPennies.multiply(new BigDecimal("0.01"), new MathContext(3));
        BigDecimal nickelsTotalValue =  numOfNickels.multiply(new BigDecimal("0.05"), new MathContext(3));
        BigDecimal dimesTotalValue = numOfDimes.multiply(new BigDecimal("0.10"), new MathContext(3));
        BigDecimal quartersTotalValue = numOfQuarters.multiply(new BigDecimal("0.25"), new MathContext(3));

        System.out.println("Result: \n");
        System.out.println("Number of Pennies: " + numOfPennies.intValue() + "\nWrappers: " + numOfPennyWrappers +
                "\nTotal estimated value: $" + penniesTotalValue + "\n");
        System.out.println("Number of Nickels: " + numOfNickels.intValue() + "\nWrappers: " + numOfNickelWrappers +
                "\nTotal estimated value: $" + nickelsTotalValue + "\n");
        System.out.println("Number of Dimes: " + numOfDimes.intValue() + "\nWrappers: " + numOfDimeWrappers +
                "\nTotal estimated value: $" + dimesTotalValue + "\n");
        System.out.println("Number of Quarters: " + numOfQuarters.intValue() + "\nWrappers: " + numOfQuarterWrappers +
                "\nTotal estimated value: $" + quartersTotalValue);
    }
}
