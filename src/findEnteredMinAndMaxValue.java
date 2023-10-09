import java.util.Scanner;
public class findEnteredMinAndMaxValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //We find out from the user how many numbers you want to enter
        System.out.print("How many numbers will you enter ? : ");
        int n = scan.nextInt();

        //We equate the maximum value to the smallest value of the integer and the minimum value to
        // the largest value of the integer to find the correct result.
        int maxValue=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;


        //If we have entered how many numbers, we loop them and find out which is the largest or the smallest
        for(int i=0; i<n;i++){
            System.out.print((i+1)+". enter the number : ");
            int number = scan.nextInt();

            if(number>maxValue){
                maxValue=number;
            }
            if(number<minValue){
                minValue=number;
            }
        }

        System.out.println("The largest number : " + maxValue);
        System.out.println("The smallest number : " + minValue);
    }
}
