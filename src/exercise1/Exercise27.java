package exercise1;

import util.ArrayUtil;

/**
 * 27. m x n o'lchamli matritsa berilgan. Har bir satrdagi eng kichik va eng katta element
 * o'rinlarini almashtiruvchi programma tuzilsin.
 */
public class Exercise27 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int minIndex = 0;
            int maxIndex = 0;

            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < matrix[i][minIndex]) {
                    minIndex = j;
                }

                if (matrix[i][j] > matrix[i][maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = matrix[i][minIndex];
            matrix[i][minIndex] = matrix[i][maxIndex];
            matrix[i][maxIndex] = temp;
        }

        System.out.println();

        System.out.println("Changed array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
