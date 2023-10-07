import java.util.Scanner;

public class factorialCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalN= 1;
        int totalR = 1;
        int totalDiff = 1;
        //Retrieving data from the user

        System.out.print("Enter a number one : ");
        int n = scan.nextInt();
        System.out.print("Enter a number two : ");
        int r = scan.nextInt();
        int diff = n-r;
        for (int i = 1; i <= n; i++) {
            totalN *= i;

        }
        for (int j = 1; j <= r; j++) {
            totalR *= j;
        }
        for (int z = 1; z<=diff; z++){
            totalDiff*=z;
        }


        int combination = totalN /(totalR * totalDiff);

        System.out.print(n + " and " + r +" the combination of their numbers : " + combination);

    }
}
