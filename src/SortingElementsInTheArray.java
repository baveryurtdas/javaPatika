import java.util.Scanner;
import java.util.Arrays;

public class SortingElementsInTheArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen dizinin boyunu giriniz : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". elemanı girin : ");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Dizinin sıralanmış hali : " + Arrays.toString(arr));


    }
}
