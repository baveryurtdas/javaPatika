import java.util.Scanner;

public class calculatingTheExponentOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k,total=1;
        System.out.print("The number of bases to be taken : ");
        n = scan.nextInt();
        System.out.print("The number that will be the base : ");
        k= scan.nextInt();
        for(int i=1; i<=k; i++){
            total*=n;
        }
        System.out.println("Asnwer = " + total);
    }
}
