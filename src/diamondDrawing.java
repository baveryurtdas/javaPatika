import java.util.Scanner;

public class diamondDrawing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number (odd number) : ");
        int n = scan.nextInt();


        // If the entered number is even, give an error message and end the program

        if (n % 2 == 0) {
            System.out.println("Please a odd number !");
            return;
        }

        int i = 1;
        // Loop to draw the top part of the top half diamond
        while (i <= n) {
            int j = 0;
            // Loop to draw spaces
            while (j < (n - i) / 2) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            // Loop to draw the stars

            while (k < i) {
                System.out.print("*");
                k++;
            }
            i += 2;
            System.out.println();
        }
        i = n - 2;
        // Loop to draw the bottom part of the top half diamond

        while (i >= 1) {
            int j = 0;
            // Loop to draw spaces

            while (j < (n - i) / 2) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            // Loop to draw the stars

            while (k < i) {
                System.out.print("*");
                k++;
            }
            i -= 2;
            System.out.println();
        }
    }
}
