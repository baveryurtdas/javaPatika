import java.util.Scanner;
public class recursiveBaseCalculation {


    static int baseCalculation(int base,int exponent){
        Scanner scan = new Scanner(System.in);
        int result=1;
        System.out.print("Please enter the base value : ");
        base= scan.nextInt();
        System.out.print("Please enter the top value : ");
        exponent=scan.nextInt();
        for(int i=1;i<=exponent;i++){
            result*=base;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.print("Result : " + baseCalculation(2,3));
    }
}
