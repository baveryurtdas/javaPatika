import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(simpleAdding(Integer.parseInt(s.nextLine())));
    }
    public static int simpleAdding(int num){
        int sum=0;
        for(int i=1;i<=num; i++)
            sum+=i;

        return num;
    }
}
