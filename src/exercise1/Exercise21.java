package exercise1;

import util.ArrayUtil;

/**
 * 21. m x n o'lchamli matritsa berilgan.
 * Musbat va manfiy elementlari soni teng bo'lgan (nol inobatga olinmaydi)
 * birinchi uchragan satr nomerini aniqlovchi programma tuzilsin.
 * Agar bunday satr bo'lmasa, "Bunday satr yo'q" deb chiqarilsin.
 */
public class Exercise21 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int positiveCount = 0;
        int negativeCount = 0;
        int rowsIndex;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > 0) {
                    positiveCount++;
                }

                if (matrix[i][j] < 0) {
                    negativeCount++;
                }
            }

            if (positiveCount == negativeCount) {
                rowsIndex = i;
                System.out.println(rowsIndex + " - row that faces positive and negative numbers are equal!");
                return;
            }

            positiveCount = 0;
            negativeCount = 0;
        }

        System.out.println("There is no such rows!");
    }
}
