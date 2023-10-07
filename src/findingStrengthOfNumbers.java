import java.util.Scanner;
public class findingStrengthOfNumbers {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        //Retrieving data from the user

        System.out.println("Enter the number of limits :");
        n = scan.nextInt();
        System.out.println();

        //Calculating the forces of 4 and 5 with a single cycle
        System.out.println("Forces of 4 and 5 : ");
        for (int i=1, j=1; i<=n || j<=n; i*=4,  j*=5){
            System.out.println("The force of 4 : "+i);
            System.out.println("The force of 5 : "+j);
        }
    }
}
