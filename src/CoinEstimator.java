import com.sun.deploy.security.CeilingPolicy;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class CoinEstimator {

    /**
     * Takes the weight of each coin in grams and then calculates:
     * - The number of coin wrappers needed
     * - The number of coins that the person has in their possession.
     * The weights are taken from the newest minting of each coin type
     * @param penny
     * @param nickel
     * @param dime
     * @param quarter
     */
    //TODO Simplify all print statements into one for each currency type!
    public static void numOfWrappersAndCoins(BigDecimal penny, BigDecimal nickel, BigDecimal dime, BigDecimal quarter){
        BigDecimal numOfPennies = penny.divide(new BigDecimal("2.50"), RoundingMode.FLOOR);
        BigDecimal numOfNickels = nickel.divide(new BigDecimal("5"), RoundingMode.FLOOR);
        BigDecimal numOfDimes = dime.divide(new BigDecimal("2.268"), RoundingMode.FLOOR);
        BigDecimal numOfQuarters = quarter.divide(new BigDecimal("5.670"), RoundingMode.FLOOR);

        //TODO perhaps rework this to a similar design as the printing of the number of wrappers below?
        System.out.println("You have an estimated: ");
        System.out.println("Pennies: " + numOfPennies.intValue());
        System.out.println("Nickels: " + numOfNickels.intValue());
        System.out.println("Dimes: " + numOfDimes.intValue());
        System.out.println("Quarters: " + numOfQuarters.intValue());

        System.out.println("\n");
        // Ensure that number of wrappers is always rounded up, even if some of the wrapper would be left empty
        System.out.println("You need the following number of coin wrappers for each coin type: ");
        System.out.println("Pennies: " + numOfPennies.divide(new BigDecimal("50"), 0, RoundingMode.CEILING));
        System.out.println("Nickels: " + numOfNickels.divide(new BigDecimal("40"),0, RoundingMode.CEILING));
        System.out.println("Dimes: " + numOfDimes.divide(new BigDecimal("50"), 0, RoundingMode.CEILING));
        System.out.println("Quarters: " + numOfQuarters.divide(new BigDecimal("40"), 0, RoundingMode.CEILING));

        System.out.println("\n");
        System.out.println("The total estimated value of these coins is: ");
        System.out.println("Pennies: $" + numOfPennies.multiply(new BigDecimal("0.01"), new MathContext(3)));
        System.out.println("Nickels: $" + numOfNickels.multiply(new BigDecimal("0.05"), new MathContext(3)));
        System.out.println("Dimes: $" + numOfDimes.multiply(new BigDecimal("0.10"), new MathContext(3)));
        System.out.println("Quarters: $" + numOfQuarters.multiply(new BigDecimal("0.25"), new MathContext(3)));
    }
}
