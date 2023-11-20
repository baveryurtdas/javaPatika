package generic;

public class Print {
    public static <T, U, Z> void printArray(T[] arr, U[] arr2, Z[] arr3) {
        for (T i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (U i : arr2) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (Z i : arr3) {
            System.out.print(i + ",");
        }
    }
}
