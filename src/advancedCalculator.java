import java.util.Scanner;

public class advancedCalculator {


    //
    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = scan.nextInt();
        System.out.println("Please enter second number : ");
        int b = scan.nextInt();
        int result = a + b;
        System.out.print("Sum is : " + result);

    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = scan.nextInt();
        System.out.println("Please enter second number : ");
        int b = scan.nextInt();
        int result = a - b;
        System.out.print("Difference is : " + result);


    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = scan.nextInt();
        System.out.println("Please enter second number : ");
        int b = scan.nextInt();
        int result = a * b;
        System.out.print("Times is : " + result);


    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        double a = scan.nextDouble();
        System.out.print("Please enter second number : ");
        double b = scan.nextDouble();
        if (b != 0) {
            double result = a / b;
            System.out.print("Divided is : " + result);
        } else {
            System.out.println("You cannot enter the divisor 0");
        }


    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value : ");
        int base = scan.nextInt();
        System.out.print("Enter the top value : ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);

    }

    static void mode() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a first number : ");
        int number1 = scan.nextInt();
        System.out.print("Please enter a second number : ");
        int number2 = scan.nextInt();
        int mod = number1 % number2;
        System.out.print("Mod : " + mod);

    }

    static void rectangular() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the lenght of the short edge : ");
        int sortEdge = scan.nextInt();
        System.out.print("Please enter the lenght of the tall edge : ");
        int tallEdge = scan.nextInt();
        int env = (sortEdge + tallEdge) * 2;
        int area = sortEdge * tallEdge;

        System.out.print("The environment of rectangle : " + env);
        System.out.println("The are of rectangle : " + area);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = """
                1- The Sum Process
                2- The Exraction Process
                3- The Multiplication Process
                4- The Division Process
                5- Exponential Number Calculation
                6- Factorial calculation
                7- Getting  Mode
                8- Rectangular area and perimeter calculation
                0- Log out""";


        while (true) {
            System.out.println(menu);
            System.out.print("Please select a transaction :");
            select = scan.nextInt();
            if (select == 0) {
                System.out.println("Good bye.");
                break;
            }


            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                case 8:
                    rectangular();
                    break;
                default:
                    System.out.println("You entered an incorrect value, try again");
                    break;
            }
        }

    }


}

