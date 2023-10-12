import java.util.Scanner;

public class isPalindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number  : ");
        int a = scan.nextInt();
        System.out.println(isPalindroom(a));
    }

    public static boolean isPalindroom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return number == reverseNumber; // if it is true, the code that prints false if it is not true on the screen



    }
}
