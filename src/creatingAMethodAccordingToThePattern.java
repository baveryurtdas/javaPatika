import java.util.Scanner;

public class creatingAMethodAccordingToThePattern {

    static void recursiveMethod(int number) {
        System.out.print(number + " ");
        if (number > 0) {
            recursiveMethod(number - 5);

        }
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N is number : ");
        int n = scan.nextInt();
        recursiveMethod(n);
    }
}
