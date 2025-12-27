package exercise1;

import util.ArrayUtil;

/**
 * 1. m va n butun musbat sonlari berilgan.
 * m x n o'lchamli matritsani shunday hosil qilingki,
 * uning har biri - satri elementlari 10 * i ga teng bo'lsin. (i =0, 1, ..., m - 1)
 * Qator yoki satr: i
 * Ustun: j
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 * i;
            }
        }

        System.out.println("The matrix after changing: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}