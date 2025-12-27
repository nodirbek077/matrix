package exercise1;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 14. m x n o'lchamli matritsa berilgan. Elementlari yig'indisi eng katta bo'lgan ustunning,
 * eng kichik elementini chiqaruvchi programma tuzilsin.
 */
public class Exercise14 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();

        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println();
        System.out.println("rows: " + rows);
        System.out.println("cols: " + cols);
        System.out.println();
        int[] temp = new int[cols];
        for (int j = 0; j < cols; j++) {
            int columnSum = 0;
            for (int[] ints : matrix) {
                columnSum += ints[j];
            }

            System.out.println("Sum of column " + (j + 1) + ": " + columnSum);

            temp[j] = columnSum;
        }
        System.out.println();
        System.out.println("Temporary array elements: " + Arrays.toString(temp));

        int max = temp[0];
        int maxIndex = 0;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
                maxIndex = i;
            }
        }

        System.out.println("The max element in the temporary array: " + max);
        System.out.println("The max index in the temporary array: " + maxIndex);

        int[] temp1 = new int[rows];
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (j == maxIndex) {
                    temp1[i] = matrix[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("The largest sum of matrix element as array: " + Arrays.toString(temp1));

        int min = temp1[0];
        for (int i : temp1) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum element: " + min);
    }
}
