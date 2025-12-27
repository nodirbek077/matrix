package exercise1;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 11. m x n o'lchamli matritsa berilgan.
 * Matritsaning har bir satri elementlari yig'indisini chiqaruvchi programma tuzilsin.
 */
public class Exercise11 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();

        System.out.println();

        int[] sumsI = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sumI = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumI += matrix[i][j];
                sumsI[i] = sumI;
            }
        }
        System.out.println(Arrays.toString(sumsI));
    }
}
