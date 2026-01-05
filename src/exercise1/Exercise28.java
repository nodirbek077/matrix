package exercise1;

import util.ArrayUtil;

/**
 * 28. m x n o'lchamli matritsa berilgan (m juft son). Matritsaning teng yarmidan
 * yuqorisi va pastini almashtiruvchi programma tuzilsin.
 * Matritsa
 * 1  1  1
 * 2  2  2
 * 3  3  3
 * 4  4  4
 * <p>
 * Natija
 * 3  3  3
 * 4  4  4
 * 1  1  1
 * 2  2  2
 */
public class Exercise28 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows % 2 != 0) {
            System.out.println("Array rows must be even number!");
            return;
        }

        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i + rows / 2][j];
                matrix[i + rows / 2][j] = temp;
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
