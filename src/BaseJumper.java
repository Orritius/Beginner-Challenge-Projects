import java.math.BigDecimal;
import java.math.RoundingMode;

// Ongoing program that will convert between any two bases within 2-16
// Currently converts between base 10 and bases 2-14
//TODO allow other bases to be converted to decimal

public class BaseJumper {


    public static void convertIntegerToBase(BigDecimal numToConvert, int baseNumberIsIn, BigDecimal baseToConvertTo){
        //TODO check base is between 2-16 (Presumably both 2nd and 3rd arguments)
        String convertedNumberString = "";
        String reversedNumberString = "";
        BigDecimal currentNumber = new BigDecimal(String.valueOf(numToConvert));
        BigDecimal remainder;
        BigDecimal result = new BigDecimal(1);

        if (baseNumberIsIn == 10){
            while (result.intValue() > 0){
                result = new BigDecimal(String.valueOf(currentNumber.divide(baseToConvertTo, 0,
                        RoundingMode.DOWN)));
                remainder = new BigDecimal(String.valueOf(currentNumber.remainder(baseToConvertTo)));
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
