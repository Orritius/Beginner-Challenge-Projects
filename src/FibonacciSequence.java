public class FibonacciSequence {

    public static void calculateFibonacciSequence(int nthTerm){
        int firstTerm = 0;
        int secondTerm = 1;
        int oldFirstTerm;

        System.out.print(firstTerm + ", " + secondTerm + ", ");

        for (int i = 0; i <= nthTerm; i++){
            oldFirstTerm = firstTerm;
            firstTerm = secondTerm;
            secondTerm = secondTerm + oldFirstTerm;
            System.out.print(secondTerm + ", ");
        }
    }
}
