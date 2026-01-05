package exercise1;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 24. m x n o'lchamli matritsa berilgan.
 * O'zi turgan satrda eng kattasi va o'zi turgan ustunda eng kichigi bo'lsan elementni aniqlovchi programma tuzilsin.
 * Agar bunday element bo'lmasa, nol chiqarilsin.
 */
public class Exercise24 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int rowMax = matrix[i][0];
            int colIndex = 0;

            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > rowMax) {
                    rowMax = matrix[i][j];
                    colIndex = j;
                }
            }
            System.out.println("Row max: " + rowMax);
            System.out.println("Col index: " + colIndex);

            boolean isMin = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] < rowMax) {
                    isMin = false;
                    break;
                }
            }

            System.out.println("is Min: " + isMin);

            if (isMin) {
                System.out.println(rowMax);
                return;
            }
        }

        System.out.println(0);
    }
}
