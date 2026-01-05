package exercise1;

import util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 26. m x n o'lchamli matritsa va k1, k2 butun sonlari berilgan (0 <= k1 < k2 < n). k1 va k2
 * ustun elementlarini almashtiruvchi programma tuzilsin.
 */
public class Exercise26 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the k1 column number (0 <= k1 < k2 < cols): ");
        int k1 = scanner.nextInt();

        System.out.print("Enter the k2 column number (0 <= k1 < k2 < cols): ");
        int k2 = scanner.nextInt();

        if (k1 < 0) {
            System.out.println("k1 should be greater or equal than zero!");
            return;
        }

        if (k1 >= k2) {
            System.out.println("k1 should be less or equal than k2!");
            return;
        }

        if (k2 >= rows) {
            System.out.println("k2 should be less than " + rows + "!");
            return;
        }

        int[] tempK1 = new int[rows];
        int[] tempK2 = new int[rows];
        int colIndexK1 = 0;
        int colIndexK2 = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                if (j == k1) {
                    tempK1[colIndexK1] = matrix[i][j];
                    colIndexK1++;
                }

                if (j == k2) {
                    tempK2[colIndexK2] = matrix[i][j];
                    colIndexK2++;
                }
            }
        }
        System.out.println();
        System.out.println("Temp array for k1 column: " + Arrays.toString(tempK1));
        System.out.println("Temp array for k2 column: " + Arrays.toString(tempK2));
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == k1) {
                    matrix[i][j] = tempK2[i];
                }

                if (j == k2) {
                    matrix[i][j] = tempK1[i];
                }
            }
        }

        System.out.println("Changed array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
