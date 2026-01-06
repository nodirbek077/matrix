package exercise1;

import util.ArrayUtil;

/**
 * 32. m x m o'lchamli kvadrat matritsa berilgan. Matritsani 90° ga buruvchi programma tuzilsin.
 * Bunda, Ã[0][0] - element A[m-1][0] bilan almashadi,
 * A[m-1][0] — element A[m-1],[m-1] bilan almashadi, va hakazo.
 */
public class Exercise32 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            System.out.println("Rows and Cols must be equal!");
            return;
        }

        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols - 1 - j];
                matrix[i][cols - 1 - j] = temp;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
