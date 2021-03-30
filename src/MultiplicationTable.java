public class MultiplicationTable {

    public static void printMultiplicationTable(int tableMax) {
        int n = 1;
        System.out.print(" ");

        for (int i = 1; i <= tableMax; i++) {
            if (i < 10) {
                System.out.print("    " + i);
            } else {
                System.out.print("   " + i);
            }
        }

        while (n <= tableMax) {
            System.out.println();
            System.out.print(n);
            for (int i = 1; i <= tableMax; i++) {
                int product = (i * n);
                String productString = Integer.toString(product);
                int productStringLength = productString.length();

                if (n >= 10 && i == 1){
                    System.out.print("  " + product);
                }

                else if (productStringLength == 1) {
                    System.out.print("    " + product);
                }
                else if (productStringLength == 2) {
                    System.out.print("   " + product);
                }
                else if (productStringLength == 3) {
                    System.out.print("  " + product);
                }
            }
            n++;
        }
    }
}
