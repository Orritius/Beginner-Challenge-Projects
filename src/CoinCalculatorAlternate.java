import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public abstract class CoinCalculatorAlternate {
    public static final String[] UNITED_KINGDOM_COINS = {("2.00"), ("1.00"), ("0.50"), ("0.20"), ("0.10"),
            ("0.05"), ("0.02"), ("0.01")};

    //TODO subgoal - Loop the program
    //TODO create alternate version of the program where the user inputs the values rather than providing them as an
    // argument
    /**
     The challenge uses US currency, I shall be using UK currency. Program assumes that we're prioritising giving
     the customer the highest amount of change. I.e. we give 47p back as two 20 pence coins, three two pence coins
     and one 1 pence coin.
     Change coins given:
     £2, £1, £0.50, £0.20, £0.10, £0.05, £0.02, £0.01
     Program challenge states that coins that are not given still need to be stated in output i.e.
     "Number of £2 coins is: 0"
     */
    public static void calculateChange(){
        System.out.println("Please enter all currency values as such: 10.42/3.56/4.95 etc");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Please enter the total cost of the transaction: ");
            BigDecimal costOfTransaction = new BigDecimal(sc.next());

            System.out.println("Please enter the amount of money tendered: ");
            BigDecimal moneyTendered = new BigDecimal(sc.next());

            // Variable to keep track of how much change is still required to be given
            BigDecimal amountLeft = new BigDecimal(String.valueOf(moneyTendered.subtract(costOfTransaction)));

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
}
