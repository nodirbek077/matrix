package exercise1;

import util.ArrayUtil;

/**
 * 23. m x n o'lchamli matritsa berilgan.
 * Bir xil elementlar soni eng ko'p bo'lgan birinchi ustunni aniqlovchi programma tuzilsin.
 */
public class Exercise23 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();

        int rows = matrix.length;
        int cols = matrix[0].length;
        int firstBestColumn = 0;
        int overallMaxRepeat = 0;
        System.out.println();

        for (int i = 0; i < cols; i++) {
            int maxInThisCol = 0;

            for (int j = 0; j < rows; j++) {
                int count = 0;
                for (int k = 0; k < rows; k++) {
                    if (matrix[k][i] == matrix[j][i]) {
                        count++;
                    }
                }

                if (count > maxInThisCol) {
                    maxInThisCol = count;
                }
            }

            if (maxInThisCol > overallMaxRepeat) {
                overallMaxRepeat = maxInThisCol;
                firstBestColumn = i;
            }
        }

        System.out.println("The first row index that the most same element: " + firstBestColumn);
        System.out.println("Repeating count: " + overallMaxRepeat);
    }
}
