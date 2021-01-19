import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class CoinCalculator {
    public static final String[] UNITED_KINGDOM_COINS = {("2.00"), ("1.00"), ("0.50"), ("0.20"), ("0.10"),
            ("0.05"), ("0.02"), ("0.01")};

    //TODO increase efficiency and maintainability. This is currently very verbose solution
    /*
    Start of an unoptimised solution
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
        // Variables to track the amount of each coin that needs to be given
        //TODO consider that this could be put into a collection?
        BigDecimal numOfTwoPoundCoins = new BigDecimal("0");
        BigDecimal numOfOnePoundCoins = new BigDecimal("0");
        BigDecimal numOfFiftyPenceCoins = new BigDecimal("0");
        BigDecimal numOfTwentyPenceCoins = new BigDecimal("0");
        BigDecimal numOfTenPenceCoins = new BigDecimal("0");
        BigDecimal numOfFivePenceCoins = new BigDecimal("0");
        BigDecimal numOfTwoPenceCoins = new BigDecimal("0");
        BigDecimal numOfOnePenceCoins = new BigDecimal("0");

        for (int i = 0; i < 8; i++){
            if (!amountLeft.divide(new BigDecimal(UNITED_KINGDOM_COINS[i]), 0 , RoundingMode.FLOOR)
            .equals(new BigDecimal("0"))){
                switch (i){
                    case 0:
                        numOfTwoPoundCoins = amountLeft.divide(new BigDecimal("2.00"),0, RoundingMode.DOWN);
                        amountLeft = amountLeft.subtract(numOfTwoPoundCoins.multiply(new BigDecimal("2.00")));
                        System.out.println("Number of £2 coins needed: "
                                + numOfTwoPoundCoins);
                    case 1:
                        numOfOnePoundCoins = amountLeft.divide(new BigDecimal("1.00"),0, RoundingMode.DOWN);
                        amountLeft = amountLeft.subtract(numOfOnePoundCoins.multiply(new BigDecimal("1.00")));
                        System.out.println("Number of £1 coins needed: "
                                + numOfOnePoundCoins);
                    case 2:
                        numOfFiftyPenceCoins = amountLeft.divide(new BigDecimal("0.50"),0, RoundingMode.DOWN);
                        amountLeft = amountLeft.subtract(numOfFiftyPenceCoins.multiply(new BigDecimal("0.50")));
                        System.out.println("Number of 50p coins needed: "
                                + numOfFiftyPenceCoins);
                    case 3:
                        numOfTwentyPenceCoins = amountLeft.divide(new BigDecimal("0.20"),0, RoundingMode.DOWN);
                        amountLeft = amountLeft.subtract(numOfTwentyPenceCoins.multiply(new BigDecimal("0.20")));
                        System.out.println("Number of 20p coins needed: "
                                + numOfTwentyPenceCoins);
                    case 4:
                        numOfTenPenceCoins = amountLeft.divide(new BigDecimal("0.10"),0, RoundingMode.DOWN);
                        amountLeft = amountLeft.subtract(numOfTenPenceCoins.multiply(new BigDecimal("0.10")));
                        System.out.println("Number of 10p coins needed: "
                                + numOfTenPenceCoins);
                    case 5:
                        numOfFivePenceCoins = amountLeft.divide(new BigDecimal("0.05"),0, RoundingMode.DOWN);
                        amountLeft = amountLeft.subtract(numOfFivePenceCoins.multiply(new BigDecimal("0.05")));
                        System.out.println("Number of 5p coins needed: "
                                + numOfFivePenceCoins);
                    case 6:
                        numOfTwoPenceCoins = amountLeft.divide(new BigDecimal("0.02"),0, RoundingMode.DOWN);
                        amountLeft = amountLeft.subtract(numOfTwoPenceCoins.multiply(new BigDecimal("0.02")));
                        System.out.println("Number of 2p coins needed: "
                                + numOfTwoPenceCoins);
                    case 7:
                        numOfOnePenceCoins = amountLeft.divide(new BigDecimal("0.01"),0, RoundingMode.DOWN);
                        amountLeft = amountLeft.subtract(numOfOnePenceCoins.multiply(new BigDecimal("0.01")));
                        System.out.println("Number of 1p coins needed: "
                                + numOfOnePenceCoins);
                }
            }
        }
    }
}
