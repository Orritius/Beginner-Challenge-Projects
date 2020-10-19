import java.math.BigDecimal;
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
    public static void numOfWrappersAndCoins(BigDecimal penny, BigDecimal nickel, BigDecimal dime, BigDecimal quarter){
        BigDecimal numOfPennies = penny.divide(new BigDecimal("2.50"), RoundingMode.FLOOR);
        BigDecimal numOfNickels = nickel.divide(new BigDecimal("5"), RoundingMode.FLOOR);
        BigDecimal numOfDimes = dime.divide(new BigDecimal("2.268"), RoundingMode.FLOOR);
        BigDecimal numOfQuarters = quarter.divide(new BigDecimal("5.670"), RoundingMode.FLOOR);

        System.out.println("You have an estimated: ");
        System.out.println("Pennies: " + numOfPennies);
        System.out.println("Nickels: " + numOfNickels);
        System.out.println("Dimes: " + numOfDimes);
        System.out.println("Quarters: " + numOfQuarters);
    }
}
