import java.util.Scanner;
public class doubleAndMultipleOfFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        //Retrieving data from the user

        System.out.println("Enter a single number to exit.");
        while (true){
            System.out.print("Enter a number : ");
            int number = scan.nextInt();
            if(number%2==1){
                break;
            }
            if(number%2==0 && number%4==0){
                sum+=number;
            }
        }
        System.out.println("The sum of the entered pair and the numbers that are multiples of 4 : " + sum);
    }
}
