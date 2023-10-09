import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int n = scanner.nextInt();
        int excellentN = 0;
        int i = 1;
        while (i < n) {
            if (n % i == 0) {
                excellentN += i;
            }
            i++;
        }
        if (excellentN == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
