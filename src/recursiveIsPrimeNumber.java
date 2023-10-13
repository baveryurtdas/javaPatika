import java.util.Scanner;

public class recursiveIsPrimeNumber {

    static boolean isPrime(int number, int dividing) {
        if (number <= 1) {
            return false;
        }
        if (dividing == 1) {
            return true;
        }
        if (number % dividing == 0) {
            return false;
        }
        return isPrime(number, dividing - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();
        boolean result = isPrime(number, number - 1);
        if (result) {
            System.out.print(number + " is a prime number.");
        } else {
            System.out.print(number + " is not a prime number.");
        }
    }
}
