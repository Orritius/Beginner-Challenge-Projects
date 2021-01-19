import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class CoinCalculator {
    public static final String[] UNITED_KINGDOM_COINS = {("2.00"), ("1.00"), ("0.50"), ("0.20"), ("0.10"),
            ("0.05"), ("0.02"), ("0.01")};
    
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

        numOfCoins[0] = amountLeft.divide(new BigDecimal("2.00"),0, RoundingMode.DOWN);
        amountLeft = amountLeft.subtract(numOfCoins[0].multiply(new BigDecimal("2.00")));
        System.out.println("Number of £2 coins needed: "
                                + numOfCoins[0]);

        numOfCoins[1] = amountLeft.divide(new BigDecimal("1.00"),0, RoundingMode.DOWN);
        amountLeft = amountLeft.subtract(numOfCoins[1].multiply(new BigDecimal("1.00")));
        System.out.println("Number of £1 coins needed: "
                + numOfCoins[1]);

        numOfCoins[2] = amountLeft.divide(new BigDecimal("0.50"),0, RoundingMode.DOWN);
        amountLeft = amountLeft.subtract(numOfCoins[2].multiply(new BigDecimal("0.50")));
        System.out.println("Number of 50p coins needed: "
                + numOfCoins[2]);

        numOfCoins[3] = amountLeft.divide(new BigDecimal("0.20"),0, RoundingMode.DOWN);
        amountLeft = amountLeft.subtract(numOfCoins[3].multiply(new BigDecimal("0.20")));
        System.out.println("Number of 20p coins needed: "
                + numOfCoins[3]);

        numOfCoins[4] = amountLeft.divide(new BigDecimal("0.10"),0, RoundingMode.DOWN);
        amountLeft = amountLeft.subtract(numOfCoins[4].multiply(new BigDecimal("0.10")));
        System.out.println("Number of 10p coins needed: "
                + numOfCoins[4]);

        numOfCoins[5] = amountLeft.divide(new BigDecimal("0.05"),0, RoundingMode.DOWN);
        amountLeft = amountLeft.subtract(numOfCoins[5].multiply(new BigDecimal("0.05")));
        System.out.println("Number of 5p coins needed: "
                + numOfCoins[5]);

        numOfCoins[6] = amountLeft.divide(new BigDecimal("0.02"),0, RoundingMode.DOWN);
        amountLeft = amountLeft.subtract(numOfCoins[6].multiply(new BigDecimal("0.02")));
        System.out.println("Number of 2p coins needed: "
                + numOfCoins[6]);

        numOfCoins[7] = amountLeft.divide(new BigDecimal("0.01"),0, RoundingMode.DOWN);
        System.out.println("Number of 1p coins needed: "
                + numOfCoins[7]);
    }
}
