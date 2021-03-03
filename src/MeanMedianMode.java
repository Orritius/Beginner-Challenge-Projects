import java.util.Map;
import java.util.TreeMap;

// Class to calculate the mean, median and mode for a user. Testing for this class can be found in the tests folder.
public abstract class MeanMedianMode {

    public static int mode(int[] nums){
        int highestNumOfOccurrences = 0;
        int mostFrequentNum = 0;
        Map<Integer, Integer> amountOfTimesOccurred = new TreeMap<>();

        for (int num : nums){
            if (!amountOfTimesOccurred.containsKey(num)){
                amountOfTimesOccurred.put(num, 1);
            } else{
                amountOfTimesOccurred.put(num, amountOfTimesOccurred.get(num) + 1);
            }
        }
        System.out.println(amountOfTimesOccurred);

        for (int num : amountOfTimesOccurred.keySet()){
            if (amountOfTimesOccurred.get(num) > highestNumOfOccurrences){
                highestNumOfOccurrences = amountOfTimesOccurred.get(num);
                mostFrequentNum = num;
            }
        }
        System.out.println("The most frequently occurring number in your collection is: " + mostFrequentNum);
        return mostFrequentNum;
    }

   //TODO return values instead of printing, potentially use a list since we can't return two different value types?
   public static void median(int[] nums){
        Arrays.sort(nums);
        
        if (nums.length % 2 == 0){
            medianEven(nums);
        } else {
            medianOdd(nums);
        }
    }

    private static void medianOdd(int[] nums){
        System.out.println(nums[nums.length/2]);
    }

    private static void medianEven(int [] nums){
        System.out.println(nums[nums.length/2 - 1]);
        System.out.println(nums[nums.length/2]);
    }

    public static BigDecimal mean(int[] nums, int decimalPlaces){
        if (decimalPlaces < 0){
            System.out.println("Please enter zero or greater for the number of decimal places of the result");
            return new BigDecimal(0);
        } else {
            int totalInteger = 0;

            for (int num : nums){
                totalInteger += num;
            }

            BigDecimal totalBigDec = new BigDecimal(totalInteger);
            BigDecimal arrayLength = new BigDecimal(nums.length);
            BigDecimal result = totalBigDec.divide(arrayLength, decimalPlaces, RoundingMode.HALF_UP);

            System.out.println("The Mean is: " + result);
            return result;
        }
    }
}
