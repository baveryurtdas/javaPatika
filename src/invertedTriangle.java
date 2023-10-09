import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = scan.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();
        int i = n;

        while (i >= 1) {
            int j = 0;
            while (j < (n - i)) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while (k < ((2*i)-1)) {
                System.out.print("*");
                k++;
            }

            i--;
            System.out.println();
        }

    }
}
