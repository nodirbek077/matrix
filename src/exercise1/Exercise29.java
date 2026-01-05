package exercise1;

import util.ArrayUtil;

/**
 * 29. m x n o'lchamli matritsa berilgan (n juft son).
 * Matritsaning teng yarmidan chap va ong qismini almashtiruvchi programma tuzilsin.
 * Matritsa
 * 1234
 * 1234
 * 1234
 * 1234
 * Natija
 * 3412
 * 3412
 * 3412
 * 3412
 */
public class Exercise29 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (cols % 2 != 0) {
            System.out.println("Array cols must be even number!");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][j + cols / 2];
                matrix[i][j + cols / 2] = temp;
            }
        }

        System.out.println("Changed array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
