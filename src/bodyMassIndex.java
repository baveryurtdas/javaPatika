import java.util.Scanner;
public class bodyMassIndex {
    public static void main(String[] args) {
        int kg;
        double h,BMI;
        //Receiving data from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height : ");
        h=input.nextDouble();
        System.out.print("Please enter your weight : ");
        kg = input.nextInt();
        BMI = kg/(h*h);
        System.out.print("Your body Mass Index : " + BMI);
    }
}
