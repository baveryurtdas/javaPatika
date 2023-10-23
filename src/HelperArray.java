public class HelperArray {
    static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static int[] copyOf(int[] arr, int value) {
        int[] copy = new int[value];

        for (int i = 0; i < Math.min(arr.length, value); i++) {
            copy[i] = arr[i];
        }

        return copy;
    }

    

    static boolean equals(int[] l1, int[] l2) {
        if (l1.length != l2.length) {
            return false;
        }
        for (int i = 0; i < l1.length; i++) {
            if (l1[i] != l2[i]){
                return false;
            }
        }

        return true;
    }


}
