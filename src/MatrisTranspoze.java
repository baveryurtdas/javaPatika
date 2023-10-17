import java.util.Arrays;

public class MatrisTranspoze {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};

        System.out.println("Matrix : ");
        printArr(matrix);
        System.out.println("Transpoze : ");
        changeArr(matrix);

    }

    public static void changeArr(int[][] matrix) {
        int[][] transpoze = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                transpoze[col][row] = matrix[row][col];
            }
        }
        printArr(transpoze);
    }

    public static void printArr(int[][] matrix) {
        for (int[] rows : matrix) {
            for(int col : rows){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

}
