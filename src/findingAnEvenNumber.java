import java.util.Scanner;

public class findingAnEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0, count = 0;
        double avarage;
        //Retrieving data from the user

        System.out.print("Enter a number : ");
        n = input.nextInt();

        //with for cycle
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;

            }

        }
        if (count > 0) {
            avarage = (double) sum / count;
            System.out.println("0'dan " + n + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması = " + avarage);
        } else {
            System.out.println("0'dan " + n + "'e kadar olan 3 ve 4'e tam bölünen bir sayı yok.");
        }
    }
}
