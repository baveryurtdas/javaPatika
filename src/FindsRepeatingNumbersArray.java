import java.util.Arrays;


public class FindsRepeatingNumbersArray {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {0, 7, 8, 4, 2, 4, 10, 21, 6, 6, 5, 5, 20, 33, 38, 78, 4, 2, 0, 6, 8, 2, 4, 10, 20};
        Arrays.sort(list);
        int[] doubleNumbers = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && !isFind(doubleNumbers, list[i])) {
                    doubleNumbers[startIndex++] = list[i];
                    break;
                }
            }


        }
        System.out.print("Çift tekrar eden sayılar : ");
        for (int i = 0; i < startIndex; i++) {
            if (doubleNumbers[i] % 2 == 0) {
                System.out.print(doubleNumbers[i] + " ");
            }
        }
    }
}

