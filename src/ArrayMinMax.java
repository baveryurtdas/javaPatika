import java.util.Scanner;
import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Dizi : " + Arrays.toString(arr)); // Diziyi olduğu gibi ekrana yazdırma.
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : "); // kullanıcıdan sayı alma
        int a = scan.nextInt();
        System.out.print("Girilen sayı : " + a);
        System.out.println();

        Arrays.sort(arr); //Diziyi küçükten büyüğe sıralama
        int minNearest = Integer.MIN_VALUE; //en yakın küçük sayıyı belirleme
        int maxNearest = Integer.MAX_VALUE; //en yakın büyük sayıyı belirleme


        //Foreach döngüsü ile girilen sayıya en yakın küçük ve en yakın büyük sayıyı bulma
        for (int i : arr) {
            if (i < a && i > minNearest) {
                minNearest = i;
            }
            if (i > a && i < maxNearest) {
                maxNearest = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minNearest);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxNearest);

    }
}
