package exercise1;

import util.ArrayUtil;

import java.util.Scanner;

/**
 * 30. m x n o'lchamli matritsa va k butun soni berilgan (0< k <m).
 * Matritsaning k - satrini o'chiruvchi programma tuzilsin.
 */
public class Exercise30 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();
        int rows = matrix.length;
        int cols = matrix[0].length;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number K: ");
        int k = input.nextInt();

        if (k >= rows) {
            System.out.println("K cannot be greater or equal than rows!");
            return;
        }

        for (int i = k; i < rows - 1; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = matrix[i + 1][j];
            }
        }

        System.out.println("Changed array: ");
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
