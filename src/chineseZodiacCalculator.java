import java.util.Scanner;
public class chineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dateOfYear,remainder;

        //Retrieving data from the user
        System.out.print("Enter your date of year : " );
        dateOfYear = input.nextInt();
        remainder = dateOfYear%12;

        //Finding the chinese zodiac based on remainder
        switch (remainder){
            case 0 :
                System.out.println("Your Chinese zodiac sign : Monkey");
                break;
            case 1 :
                System.out.println("Your Chinese zodiac sign : Cockerel");
                break;
            case 2 :
                System.out.println("Your Chinese zodiac sign : Dog");
                break;
            case 3 :
                System.out.println("Your Chinese zodiac sign : Pig");
                break;
            case 4 :
                System.out.println("Your Chinese zodiac sign : Mouse");
                break;
            case 5 :
                System.out.println("Your Chinese zodiac sign : Bull");
                break;
            case 6 :
                System.out.println("Your Chinese zodiac sign : Tiger");
                break;
            case 7 :
                System.out.println("Your Chinese zodiac sign : Rabbit");
                break;
            case 8 :
                System.out.println("Your Chinese zodiac sign : Dragon");
                break;
            case 9 :
                System.out.println("Your Chinese zodiac sign : Snake");
                break;
            case 10 :
                System.out.println("Your Chinese zodiac sign : Horse");
                break;
            case 11:
                System.out.println("Your Chinese zodiac sign : Sheep");
                break;
            default:
                System.out.println("Please enter a valid date of birth.");
        }

    }
}
