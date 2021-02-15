import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

/*
Very easy challenges from the website Edabit. 
 */

public class EdabitVeryEasy {

    public static void main(String[] args) {
        System.out.println(EdabitVeryEasy.calculateFuel(15));
        System.out.println(EdabitVeryEasy.calculateFuel(23.5));
        System.out.println(EdabitVeryEasy.calculateFuel(3));

        System.out.println(EdabitVeryEasy.sumOfTwoNumbers(3, 2));
        System.out.println(EdabitVeryEasy.sumOfTwoNumbers(-3, -6));
        System.out.println(EdabitVeryEasy.sumOfTwoNumbers(7, 3));

        System.out.println(EdabitVeryEasy.convert(5));
        System.out.println(EdabitVeryEasy.convert(3));
        System.out.println(EdabitVeryEasy.convert(2));

        System.out.println(EdabitVeryEasy.addition(0));
        System.out.println(EdabitVeryEasy.addition(9));
        System.out.println(EdabitVeryEasy.addition(-3));

        System.out.println(EdabitVeryEasy.isSameNum(4, 8));
        System.out.println(EdabitVeryEasy.isSameNum(2, 2));
        System.out.println(EdabitVeryEasy.isSameNum(42, 32));

        System.out.println(EdabitVeryEasy.howManySeconds(2));
        System.out.println(EdabitVeryEasy.howManySeconds(10));
        System.out.println(EdabitVeryEasy.howManySeconds(24));

        System.out.println(EdabitVeryEasy.findPerimeter(6, 7));
        System.out.println(EdabitVeryEasy.findPerimeter(20, 10));
        System.out.println(EdabitVeryEasy.findPerimeter(2, 9));

        System.out.println(EdabitVeryEasy.power(230, 10));
        System.out.println(EdabitVeryEasy.power(110, 3));
        System.out.println(EdabitVeryEasy.power(480, 20));

        System.out.println(EdabitVeryEasy.nextEdge(8, 10));
        System.out.println(EdabitVeryEasy.nextEdge(5, 7));
        System.out.println(EdabitVeryEasy.nextEdge(9, 2));

        System.out.println(EdabitVeryEasy.triArea(3, 2));
        System.out.println(EdabitVeryEasy.triArea(7, 4));
        System.out.println(EdabitVeryEasy.triArea(10, 10));

        System.out.println(EdabitVeryEasy.lessThanOrEqualToZero(5));
        System.out.println(EdabitVeryEasy.lessThanOrEqualToZero(0));
        System.out.println(EdabitVeryEasy.lessThanOrEqualToZero(-2));

        System.out.println(EdabitVeryEasy.remainder(1, 3));
        System.out.println(EdabitVeryEasy.remainder(3, 4));
        System.out.println(EdabitVeryEasy.remainder(-9, 45));
        System.out.println(EdabitVeryEasy.remainder(5, 5));

        System.out.println(EdabitVeryEasy.giveSomething("is better than nothing"));
        System.out.println(EdabitVeryEasy.giveSomething("Bob Jane"));
        System.out.println(EdabitVeryEasy.giveSomething("something"));

        System.out.println(EdabitVeryEasy.calcAge(65));
        System.out.println(EdabitVeryEasy.calcAge(0));
        System.out.println(EdabitVeryEasy.calcAge(20));
        System.out.println(EdabitVeryEasy.calcAge(25));

        System.out.println(EdabitVeryEasy.lessThan100(22, 15));
        System.out.println(EdabitVeryEasy.lessThan100(83, 34));
        System.out.println(EdabitVeryEasy.lessThan100(3, 77));

        System.out.println(EdabitVeryEasy.points(13, 12));
        System.out.println(EdabitVeryEasy.points(17, 12));
        System.out.println(EdabitVeryEasy.points(38, 8));

        System.out.println(EdabitVeryEasy.helloName("Gerald"));
        System.out.println(EdabitVeryEasy.helloName("Tiffany"));
        System.out.println(EdabitVeryEasy.helloName("Ed"));

        System.out.println(EdabitVeryEasy.animals(2, 3, 5));
        System.out.println(EdabitVeryEasy.animals(1, 2, 3));
        System.out.println(EdabitVeryEasy.animals(5, 2, 8));

        System.out.println(EdabitVeryEasy.footballPoints(3, 4, 2));
        System.out.println(EdabitVeryEasy.footballPoints(5, 0, 2));
        System.out.println(EdabitVeryEasy.footballPoints(0, 0, 1));

        System.out.println(EdabitVeryEasy.divisibleBy5(5));
        System.out.println(EdabitVeryEasy.divisibleBy5(-55));
        System.out.println(EdabitVeryEasy.divisibleBy5(37));

        System.out.println(EdabitVeryEasy.convert(1, 3));
        System.out.println(EdabitVeryEasy.convert(2, 0));
        System.out.println(EdabitVeryEasy.convert(0, 0));

        System.out.println(EdabitVeryEasy.getFirstValue(new int[]{1, 2, 3}));
        System.out.println(EdabitVeryEasy.getFirstValue(new int[]{80, 5, 100}));
        System.out.println(EdabitVeryEasy.getFirstValue(new int[]{-500, 0, 50}));

        System.out.println(reverse(true));
        System.out.println(reverse(false));

        System.out.println(EdabitVeryEasy.area(3, 4));
        System.out.println(EdabitVeryEasy.area(10, 11));
        System.out.println(EdabitVeryEasy.area(-1, 5));
        System.out.println(EdabitVeryEasy.area(0, 2));

        System.out.println(EdabitVeryEasy.makesTen(9, 10));
        System.out.println(EdabitVeryEasy.makesTen(9, 9));
        System.out.println(EdabitVeryEasy.makesTen(1, 9));

        System.out.println(EdabitVeryEasy.nameString("Mubashir"));
        System.out.println(EdabitVeryEasy.nameString("Matt"));
        System.out.println(EdabitVeryEasy.nameString("java"));

        System.out.println(EdabitVeryEasy.divisible(1));
        System.out.println(EdabitVeryEasy.divisible(1000));
        System.out.println(EdabitVeryEasy.divisible(100));

        System.out.println(EdabitVeryEasy.getVoteCount(new int[]{13, 0}));
        System.out.println(EdabitVeryEasy.getVoteCount(new int[]{2, 33}));
        System.out.println(EdabitVeryEasy.getVoteCount(new int[]{132, 132}));

        System.out.println(EdabitVeryEasy.and(true, false));
        System.out.println(EdabitVeryEasy.and(true, true));
        System.out.println(EdabitVeryEasy.and(false, true));
        System.out.println(EdabitVeryEasy.and(false, false));

        System.out.println(EdabitVeryEasy.dividesEvenly(98, 7));
        System.out.println(EdabitVeryEasy.dividesEvenly(85, 4));

        System.out.println(EdabitVeryEasy.squared(5));
        System.out.println(EdabitVeryEasy.squared(9));
        System.out.println(EdabitVeryEasy.squared(100));

        System.out.println(EdabitVeryEasy.profitableGamble(0.2, 50, 9));
        System.out.println(EdabitVeryEasy.profitableGamble(0.9, 1, 2));
        System.out.println(EdabitVeryEasy.profitableGamble(0.9, 3, 2));

        System.out.println(EdabitVeryEasy.howManyWalls(54, 1, 43));
        System.out.println(EdabitVeryEasy.howManyWalls(46, 5, 4));
        System.out.println(EdabitVeryEasy.howManyWalls(100, 4, 5));
        System.out.println(EdabitVeryEasy.howManyWalls(10, 15, 12));
        System.out.println(EdabitVeryEasy.howManyWalls(41, 3, 6));

        System.out.println(EdabitVeryEasy.sumOfAngles(3));
        System.out.println(EdabitVeryEasy.sumOfAngles(4));
        System.out.println(EdabitVeryEasy.sumOfAngles(6));

        System.out.println(EdabitVeryEasy.concatName("First", "Last"));
        System.out.println(EdabitVeryEasy.concatName("John", "Doe"));
        System.out.println(EdabitVeryEasy.concatName("Mary", "Jane"));

        System.out.println(EdabitVeryEasy.isEmpty(""));
        System.out.println(EdabitVeryEasy.isEmpty(" "));
        System.out.println(EdabitVeryEasy.isEmpty("a"));

        System.out.println(EdabitVeryEasy.frames(1, 1));
        System.out.println(EdabitVeryEasy.frames(10, 1));
        System.out.println(EdabitVeryEasy.frames(10, 25));

        System.out.println(isEvenOrOdd(3));
        System.out.println(isEvenOrOdd(146));
        System.out.println(isEvenOrOdd(19));

        System.out.println(EdabitVeryEasy.volumeOfBox(new int[]{2, 5, 1}));
        System.out.println(EdabitVeryEasy.volumeOfBox(new int[]{4, 2, 2}));
        System.out.println(EdabitVeryEasy.volumeOfBox(new int[]{1, 2, 3}));

        int[] nums = EdabitVeryEasy.makePair(1, 2);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        nums = EdabitVeryEasy.makePair(51, 21);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        nums = EdabitVeryEasy.makePair(512124, 215);
        System.out.println(nums[0]);
        System.out.println(nums[1]);

        System.out.println(EdabitVeryEasy.mod(5, 2));
        System.out.println(EdabitVeryEasy.mod(218, 5));
        System.out.println(EdabitVeryEasy.mod(6, 3));

        System.out.println(EdabitVeryEasy.stackBoxes(1));
        System.out.println(EdabitVeryEasy.stackBoxes(2));
        System.out.println(EdabitVeryEasy.stackBoxes(0));

        System.out.println(EdabitVeryEasy.comp("AB", "CD"));
        System.out.println(EdabitVeryEasy.comp("ABC", "DE"));
        System.out.println(EdabitVeryEasy.comp("hello", "edabit"));

        System.out.println(EdabitVeryEasy.flipIntBool(1));
        System.out.println(EdabitVeryEasy.flipIntBool(0));

        System.out.println(EdabitVeryEasy.inchesToFeet(324));
        System.out.println(EdabitVeryEasy.inchesToFeet(12));
        System.out.println(EdabitVeryEasy.inchesToFeet(36));
        System.out.println(EdabitVeryEasy.inchesToFeet(2));

        System.out.println(EdabitVeryEasy.nameGreeting("Matt"));
        System.out.println(EdabitVeryEasy.nameGreeting("Helen"));
        System.out.println(EdabitVeryEasy.nameGreeting("Mubashir"));

        System.out.println(EdabitVeryEasy.equalSlices(11, 5, 2));
        System.out.println(EdabitVeryEasy.equalSlices(11, 5, 3));
        System.out.println(EdabitVeryEasy.equalSlices(8, 3, 2));
        System.out.println(EdabitVeryEasy.equalSlices(8, 3, 3));
        System.out.println(EdabitVeryEasy.equalSlices(24, 12, 2));

        System.out.println(EdabitVeryEasy.returnNegative(4));
        System.out.println(EdabitVeryEasy.returnNegative(5));
        System.out.println(EdabitVeryEasy.returnNegative(-54));
        System.out.println(EdabitVeryEasy.returnNegative(0));

        System.out.println(EdabitVeryEasy.acceptIntoMovie(14, true));
        System.out.println(EdabitVeryEasy.acceptIntoMovie(14, false));
        System.out.println(EdabitVeryEasy.acceptIntoMovie(16, false));

        System.out.println(EdabitVeryEasy.addParityBit("1011011"));
        System.out.println(EdabitVeryEasy.addParityBit("0010110"));
        System.out.println(EdabitVeryEasy.addParityBit("1100000"));
        System.out.println(EdabitVeryEasy.addParityBit("1111111"));

        System.out.println(EdabitVeryEasy.length("apple"));
        System.out.println(EdabitVeryEasy.length("make"));
        System.out.println(EdabitVeryEasy.length("a"));
        System.out.println(EdabitVeryEasy.length(""));

        System.out.println(EdabitVeryEasy.valueAt(new int[]{1, 2, 3, 4, 5, 6}, 10/2));
        System.out.println(EdabitVeryEasy.valueAt(new int[]{1, 2, 3, 4, 5, 6}, 8/2));
        System.out.println(EdabitVeryEasy.valueAt(new int[]{1, 2, 3, 4}, 6.535355314/2));

        System.out.println(EdabitVeryEasy.even(1));
        System.out.println(EdabitVeryEasy.even(2));
        System.out.println(EdabitVeryEasy.even(100));

        System.out.println(EdabitVeryEasy.absolute(-1.217197940));
        System.out.println(EdabitVeryEasy.absolute(-12.1320));
        System.out.println(EdabitVeryEasy.absolute(-544.0));
        System.out.println(EdabitVeryEasy.absolute(4666));
        System.out.println(EdabitVeryEasy.absolute(-3.14));
        System.out.println(EdabitVeryEasy.absolute(250));

        System.out.println(EdabitVeryEasy.howManyStickers(1));
        System.out.println(EdabitVeryEasy.howManyStickers(2));
        System.out.println(EdabitVeryEasy.howManyStickers(3));

        System.out.println(EdabitVeryEasy.hasSpaces("hello"));
        System.out.println(EdabitVeryEasy.hasSpaces("hello, world"));
        System.out.println(EdabitVeryEasy.hasSpaces(" "));
        System.out.println(EdabitVeryEasy.hasSpaces(""));
        System.out.println(EdabitVeryEasy.hasSpaces(",./!@#"));

        System.out.println(EdabitVeryEasy.ctoa('A'));
        System.out.println(EdabitVeryEasy.ctoa('m'));
        System.out.println(EdabitVeryEasy.ctoa('['));
        System.out.println(EdabitVeryEasy.ctoa('\\'));

        System.out.println(EdabitVeryEasy.getLastItem(new int[]{1, 2, 3}));
        System.out.println(EdabitVeryEasy.getLastItem(new int[]{0}));
        System.out.println(EdabitVeryEasy.getLastItem(new int[]{-1, -3}));

        System.out.println(EdabitVeryEasy.getXP(89, 77, 30,
                4, 1));
        System.out.println(EdabitVeryEasy.getXP(254, 32, 65,
                51, 34));
        System.out.println(EdabitVeryEasy.getXP(11, 0, 2,
                0, 27));

        System.out.println(EdabitVeryEasy.startsWithUpperCaseAZ("Matthew"));
        System.out.println(EdabitVeryEasy.startsWithUpperCaseAZ("Anna"));
        System.out.println(EdabitVeryEasy.startsWithUpperCaseAZ("Zewchi"));

        System.out.println(EdabitVeryEasy.areaOfCircle(5));

        System.out.println(EdabitVeryEasy.addElementsInArray(new int[]{1, 5, 6, 123, 4, 50}));

        System.out.println(addNums(5));
        System.out.println(addNums(10));

        fibonacciSequence(10);

        System.out.println(reverseString("Matthew"));

        multiTable(12);

        String[] words = splitString("Hello this is my test");

        for (String word: words){
            System.out.println(word);
        }
    }

    // Let's fuel up
    public static double calculateFuel(double distance) {
        double fuelRequired = distance * 10;
        if (fuelRequired < 100) {
            fuelRequired = 100;
        }
        return fuelRequired;
    }

    // Sum of two numbers
    public static int sumOfTwoNumbers(int x, int y) {
        return x + y;
    }

    // Minutes to seconds
    public static int convert(int minutes) {
        return minutes * 60;
    }

    // Next number
    public static int addition(int aNum) {
        return aNum + 1;
    }

    // Same number
    public static boolean isSameNum(int x, int y) {
        return x == y;
    }

    // Convert hours into seconds
    public static int howManySeconds(int hours) {
        return hours * 3600;
    }

    // Perimeter of rectangle
    public static int findPerimeter(int length, int width) {
        return (length * 2) + (width * 2);
    }

    // Power calculator
    public static int power(int voltage, int current) {
        return voltage * current;
    }

    // Max edge of triangle
    public static int nextEdge(int side1, int side2) {
        return (side1 + side2) - 1;
    }

    // Area of a triangle
    public static int triArea(int base, int height) {
        return (base * height) / 2;
    }

    // Is number less than or equal to zero?
    public static boolean lessThanOrEqualToZero(int aNum) {
        return (aNum <= 0);
    }

    // Remainder returner
    public static int remainder(int x, int y) {
        return x % y;
    }

    // Return something to me
    public static String giveSomething(String a) {
        return "Something " + a;
    }

    // Convert age to days
    public static int calcAge(int age) {
        return age * 365;
    }

    // Less than 100?
    public static boolean lessThan100(int x, int y) {
        return (x + y) < 100;
    }

    // Basketball points
    public static int points(int twoPointers, int threePointers) {
        return (twoPointers * 2) + (threePointers * 3);
    }

    // Hello human
    public static String helloName(String usersName) {
        return "Hello " + usersName;
    }

    // The farm problem
    public static int animals(int chickens, int cows, int pigs) {
        return (chickens * 2) + (cows * 4) + (pigs * 4);
    }

    // Football points
    public static int footballPoints(int wins, int draws, int losses) {
        return (wins * 3) + (draws);
    }

    // Divisible by 5
    public static boolean divisibleBy5(int x) {
        return (x % 5 == 0);
    }

    // hours and minutes into seconds
    public static int convert(int hours, int minutes) {
        return (hours * 3600) + (minutes * 60);
    }

    // First element of array
    public static int getFirstValue(int[] nums) {
        return nums[0];
    }

    // reverse boolean
    public static boolean reverse(boolean b) {
        return !b;
    }

    // area of rectangle
    public static int area(int width, int height) {
        if (height <= 0 || width <= 0) {
            return -1;
        }
        return (width * height);
    }

    // two makes ten
    public static boolean makesTen(int x, int y) {
        return (x == 10) || (y == 10) || (x + y == 10);
    }

    // name concatenation
    public static String nameString(String personName) {
        return personName + "Edabit";
    }

    // Divisible by 100
    public static boolean divisible(int x) {
        return (x % 100 == 0);
    }

    // upvotes vs downvotes
    public static int getVoteCount(int[] votes) {
        return (votes[0] - votes[1]);
    }

    // && Operator
    public static boolean and(boolean bool1, boolean bool2) {
        return (bool1 && bool2);
    }

    // divides evenly
    public static boolean dividesEvenly(double x, double y) {
        return (x / y % 1 == 0);
    }

    // square challenge
    public static int squared(int x) {
        return (x * x);
    }

    // profitable gamble?
    public static boolean profitableGamble(double prob, int prize, int pay) {
        return (prob * prize > pay);
    }

    // new shade of blue
    public static int howManyWalls(int n, int width, int height) {
        int squareMetreOfOneWall = width * height;
        return n / squareMetreOfOneWall;
    }

    // Sum of polygon angles
    public static int sumOfAngles(int n) {
        return (n - 2) * 180;
    }

    // String concatenation
    public static String concatName(String first, String last) {
        return last + ", " + first;
    }

    // Is string empty?
    public static boolean isEmpty(String aString) {
        return aString.isEmpty();
    }

    // frames per second
    public static int frames(int min, int frames) {
        return (min * 60) * frames;
    }

    // even or odd
    public static String isEvenOrOdd(int x) {
        return (x % 2 == 0) ? "Even" : "Odd";
    }

    // volume of box
    public static int volumeOfBox(int[] sizes) {
        return sizes[0] * sizes[1] * sizes[2];
    }

    // Pair Management
    public static int[] makePair(int x, int y) {
        return new int[]{x, y};
    }

    // More difficult
    public static int mod(int x, int y) {
        return x - (y * (x / y));
    }

    // stack the boxes
    public static int stackBoxes(int numOfBoxes) {
        return (numOfBoxes * numOfBoxes);
    }

    // Length of string
    public static boolean comp(String string1, String string2) {
        return (string1.length() == string2.length());
    }

    // flip int boolean
    public static int flipIntBool(int x) {
        if (x == 1) {
            return 0;
        }
        return 1;
    }

    // inches to feet
    public static int inchesToFeet(int inches) {
        if (inches < 12) {
            return 0;
        }
        return inches / 12;
    }

    // Buggy code part 4
    public static String nameGreeting(String aName) {
        if (aName.equals("Mubashir")) {
            return aName + " hello, my love!";
        }
        return "Hello, " + aName;
    }

    // slice of pie
    public static boolean equalSlices(int totalSlices, int recipientNum, int slicesEach) {
        if (recipientNum == 0) {
            return false;
        }
        return totalSlices >= (recipientNum * slicesEach);
    }

    // return negative
    public static int returnNegative(int x) {
        if (x < 0) {
            return x;
        }
        return -x;
    }

    // Movie theatre admittance
    public static boolean acceptIntoMovie(int age, boolean isSupervised) {
        return (age >= 15 || isSupervised);
    }

    // parity bits
    public static String addParityBit(String binaryNumber) {
        int numberOfOnes = 0;

        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '1') {
                numberOfOnes++;
            }
        }
        System.out.println("Number of ones: " + numberOfOnes);

        if (numberOfOnes % 2 == 0) {
            return binaryNumber + "0";
        } else
            return binaryNumber + "1";
    }

    // recursive length of string count. Bit more difficult
    public static int length(String aString) {
        if (aString.equals("")){
            return 0;
        } else {
            return length(aString.substring(1)) + 1;
        }
    }

    // Array indexing
    public static int valueAt(int[] nums, double index){
        return nums[(int)index];
    }

    // nth even number
    public static int even(int x){
        return x * 2 - 2;
    }

    // recreating abs method
    public static double absolute(double aNum){
        if (aNum < 0){
            return aNum - (aNum * 2);
        }
        return aNum;
    }

    // number of stickers
    public static int howManyStickers(int n){
        return ((n * n) * 6);
    }

    // Check string for spaces
    public static boolean hasSpaces(String aString){
        return aString.contains(" ");
    }

    // char to ASCII
    public static int ctoa(char c){
        return c;
    }

    // last element in an array
    public static int getLastItem(int[] nums){
        return nums[nums.length-1];
    }

    // Edabit experience points
    public static String getXP(int veryEasyChallengeNum, int easyChallengeNum, int mediumChallengeNum,
                            int hardChallengeNum, int veryHardChallengeNum){
        return (veryEasyChallengeNum * 5) + (easyChallengeNum * 10) + (mediumChallengeNum * 20) +
                (hardChallengeNum * 40) + (veryHardChallengeNum * 80) + "XP";
    }

    public static boolean startsWithUpperCaseAZ(String theString){
        return (theString.charAt(0) == 'A' || theString.charAt(0) == 'Z' );
    }

    public static double areaOfCircle(double radius){
        double area = Math.PI  * (radius * radius);
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(area));
    }

    public static int addElementsInArray(int[] nums){
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public static int addNums(int x){
        if (x == 0){
            return 0;
        } else {
            return addNums(x - 1) + x;
        }
    }

    public static void fibonacciSequence(int x){
        int lowerNum = 0;
        int higherNum = 1;
        System.out.print(lowerNum + ", " + higherNum + ", ");

        for (int i = 0; i < x; i++){
            int previousNum = higherNum;
            higherNum = lowerNum + higherNum;
            System.out.print(higherNum + ", ");
            lowerNum = previousNum;
        }
    }

    public static String reverseString (String aString){
        String reversedString = "";
        for (int i = aString.length() - 1; i >= 0; i--){
            reversedString += aString.charAt(i);
        }
        return reversedString;
    }

    public static void multiTable (int x){
        for (int i = 1; i <= x; i++){
            System.out.println(i);
            for (int n = 1; n <= x; n++){
                System.out.printf("%4d%n", n * i);
            }
        }
    }

    public static String[] splitString(String aString){
        return (aString.split(" "));
    }
}
