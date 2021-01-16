import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class CoinCalculator {

    //TODO sort out other coin types and check functionality
    /*
    Start of an unoptimised solution
    The challenge uses US currency, I shall be using UK currency. Program assumes that we're prioritising giving
    the customer the highest amount of change. I.e. we give 47p back as two 20 pence coins, three two pence coins
    and one 1 pence coin.
    Change coins given:
    £2, £1, £0.50, £0.20, £0.10, £0.05, £0.02, £0.01
     */
    public static BigDecimal calculateChange(BigDecimal anAmount){
        // variable to store the amount left after a certain amount of change has been given
        BigDecimal amountLeft = anAmount;
        // amount of change variables initialised
        BigDecimal numOfTwoPoundCoins = new BigDecimal("0");
        BigDecimal numOfOnePoundCoins = new BigDecimal("0");
        BigDecimal numOfFiftyPenceCoins = new BigDecimal("0");
        BigDecimal numOfTwentyPenceCoins = new BigDecimal("0");
        BigDecimal numOfTenPenceCoins = new BigDecimal("0");
        BigDecimal numOfFivePenceCoins = new BigDecimal("0");
        BigDecimal numOfTwoPenceCoins = new BigDecimal("0");
        BigDecimal numOfOnePenceCoins = new BigDecimal("0");

        if (!amountLeft.divide(new BigDecimal("2.00"), 0, RoundingMode.FLOOR).equals(new BigDecimal("0"))){
            numOfTwoPoundCoins = amountLeft.divide(new BigDecimal("2.00"),0, RoundingMode.DOWN);
            amountLeft = amountLeft.subtract(numOfTwoPoundCoins.multiply(new BigDecimal("2.00")));
            System.out.println("This is the number of twopoundcoin change that was recorded " + numOfTwoPoundCoins);
            System.out.println("This is the new amount that is left after our calculation " + amountLeft);
        }

        if (!amountLeft.divide(new BigDecimal("1.00"), 0, RoundingMode.FLOOR).equals(new BigDecimal("0.00"))){
            numOfOnePoundCoins = amountLeft.divide(new BigDecimal("1.00"),0, RoundingMode.DOWN);
            amountLeft = amountLeft.subtract(numOfOnePoundCoins.multiply(new BigDecimal("1.00")));
            System.out.println("This is the number of onepoundcoin change that was recorded " + numOfOnePoundCoins);
            System.out.println("This is the new amount that is left after our calculation " + amountLeft);
        }

        if (!amountLeft.divide(new BigDecimal("0.50"), 0, RoundingMode.FLOOR).equals(new BigDecimal("0.00"))){
            numOfFiftyPenceCoins = amountLeft.divide(new BigDecimal("0.50"),0, RoundingMode.DOWN);
            amountLeft = amountLeft.subtract(numOfFiftyPenceCoins.multiply(new BigDecimal("0.50")));
            System.out.println("This is the number of fiftypence change that was recorded " + numOfFiftyPenceCoins);
            System.out.println("This is the new amount that is left after our calculation " + amountLeft);
        }

        return anAmount;
    }
}