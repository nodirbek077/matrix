package exercise1;

import util.ArrayUtil;

/**
 * 31. m x m o'lchamli kvadrat matritsa berilgan. Matritsani 180° ga buruvchi programma tuzilsin.
 * Bunda, Ã[0][0] - element A[m-1][m-1] bilan almashadi,
 * A[0][1] — element A[m-1],[m-2] bilan almashadi, va hakazo.
 */
public class Exercise31 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols){
            System.out.println("Rows and Cols must be equal!");
            return;
        }

        System.out.println();
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows - 1 - i][cols - 1 - j];
                matrix[rows - 1 - i][cols - 1 - j] = temp;
            }
        }

        System.out.println();

        for (int[] ints : matrix) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
