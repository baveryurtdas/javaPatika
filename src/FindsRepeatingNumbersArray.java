import java.util.Arrays;


public class FindsRepeatingNumbersArray {


    public static void main(String[] args) {
        int[] list = {0, 7, 8, 4, 2, 9, 10, 21, 5, 20, 33, 38, 78};
        int[] doubleNumbers = new int[list.length];
        int[] oddNumbers = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                doubleNumbers[startIndex++] = list[i];
            } else {
                oddNumbers[startIndex++] = list[i];
            }
        }

        for (int value : doubleNumbers) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println();

        for (int value : oddNumbers) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }


    }
}

