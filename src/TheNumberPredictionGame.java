import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class TheNumberPredictionGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100);

        Scanner scn = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("Kalan hakkınız : " + (5 - right));
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = scn.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arası bir değer giriniz. ");
                if (isWrong) {
                    right++;
                    System.out.println("Hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                }
            }
            if (selected == num) {
                System.out.println("Doğru tahmin, tahmin ettiğin sayı " + num);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz .");
                if (selected > num) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hak : " + (5 - right));
            }

        }
        if(!isWin){
            System.out.println("Kaybettiniz, doğru sayı : " + num);
            if(!isWrong){
                System.out.print("Tahminleriniz : " +Arrays.toString(wrong));
            }
        }
    }
}
