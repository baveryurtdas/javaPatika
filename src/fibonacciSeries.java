import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = scan.nextInt();
        System.out.print("Fibonacci Series : ");
        int a = 0, b = 1;
        int i = 0;
        while (i < n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }
    }
}
