import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class CoinCalculator {
    public static final String[] UNITED_KINGDOM_COINS = {("2.00"), ("1.00"), ("0.50"), ("0.20"), ("0.10"),
            ("0.05"), ("0.02"), ("0.01")};

    //TODO consider changing new bigdecimal to the array location United kingdom coins instead!!!!
    /*
    The challenge uses US currency, I shall be using UK currency. Program assumes that we're prioritising giving
    the customer the highest amount of change. I.e. we give 47p back as two 20 pence coins, three two pence coins
    and one 1 pence coin.
    Change coins given:
    £2, £1, £0.50, £0.20, £0.10, £0.05, £0.02, £0.01
    Program challenge states that coins that are not given still need to be stated in output i.e.
    "Number of £2 coins is: 0"
     */
    public static void calculateChange(BigDecimal anAmount){
        // Variable to keep track of how much change is still required to be given
        BigDecimal amountLeft = anAmount;

        // Array holding each number of coin needed (ranging from £2 to 1p)
        BigDecimal[] numOfCoins = {new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"),
                new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"),
                new BigDecimal("0")};

        /* Because we have to print out coins all coins (even if they are not needed in the change, we don't need
        to do any form of testing first (as in previous solution iterations)
         */

        for (int i = 0; i < 8; i++){
            numOfCoins[i] = amountLeft.divide(new BigDecimal(UNITED_KINGDOM_COINS[i]), 0, RoundingMode.FLOOR);
            amountLeft = amountLeft.subtract(numOfCoins[i].multiply(new BigDecimal(UNITED_KINGDOM_COINS[i])));
            System.out.println("Number of £" + UNITED_KINGDOM_COINS[i] + " needed: " + numOfCoins[i]);
        }
    }
}
