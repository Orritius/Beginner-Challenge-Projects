import java.math.BigDecimal;
import java.math.RoundingMode;

// Ongoing program that will convert between any two bases within 2-16
// Currently converts between base 10 and base 2

public class BaseJumper {


    public static void convertIntegerToBase(BigDecimal numToConvert, int baseNumberIsIn, BigDecimal baseToConvertTo){
        //TODO base is between 2-16 (Presumably both 2nd and 3rd arguments)
        String convertedNumberString = "";
        String reversedNumberString = "";
        BigDecimal currentNumber = new BigDecimal(String.valueOf(numToConvert));
        BigDecimal remainder;
        BigDecimal result = new BigDecimal(1);

        if (baseNumberIsIn == 10){
            while (result.intValue() > 0){
                result = new BigDecimal(String.valueOf(currentNumber.divide(baseToConvertTo, 0,
                        RoundingMode.DOWN)));
                System.out.println(result);
                remainder = new BigDecimal(String.valueOf(currentNumber.remainder(baseToConvertTo)));
                System.out.println(remainder);
                convertedNumberString += Integer.toString(remainder.intValue());
                currentNumber = result;
            }
            for (int i = convertedNumberString.length() - 1; i >= 0; i--){
                reversedNumberString += convertedNumberString.charAt(i);
            }
            System.out.println(reversedNumberString);
        }
    }
}
