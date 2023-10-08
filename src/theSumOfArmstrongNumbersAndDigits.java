import java.util.Scanner;

public class theSumOfArmstrongNumbersAndDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("3 digit armstrong numbers :");
        int numberPow = 1;

        //a loop is started to check the 3-Decker numbers between 100 and 999.
        for (int i = 100; i <= 999; i++) {
            int mod;
            int tempI = i, tempII = i;
            int total = 0, sayac = 0;
            int totalB = 0;
            //A loop is used to find out how many digits the number is and the counter stores the variable.

            while (tempI != 0) {
                tempI /= 10;
                sayac++;
            }

            // A loop is used to calculate the exponent of each digit and at the same time calculate the sum of digits.

            while (tempII != 0) {
                mod = tempII % 10;
                for (int j = 1; j <= sayac; j++) {
                    numberPow *= mod;
                }
                totalB += mod;
                total += numberPow;
                numberPow = 1;
                tempII /= 10;

            }

            if (i == total) {
                System.out.println("Armstrong number : " + i + ", Sum of Digits : " + totalB);
            }
        }
    }
}
