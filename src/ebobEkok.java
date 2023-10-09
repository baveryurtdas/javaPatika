import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a N1 number : ");
        int n1 = scan.nextInt();
        System.out.print("Please enter a N2 number : ");
        int n2 = scan.nextInt();
        int ebob = 1;
        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob : " + ebob);
        int ekok = (n1 * n2) / ebob;

        System.out.println("Ekok : " + ekok);

    }
}
