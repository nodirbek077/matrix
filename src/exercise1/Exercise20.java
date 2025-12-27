package exercise1;

import util.ArrayUtil;
/**
 * 20. m x n o'lchamli matritsa berilgan.
 * Har bir satrda, shu satr o'rta arifmetigidan kichik bo'lgan elementlar sonini chiqaruvchi programma tuzilsin.
 */
public class Exercise20 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println();
        System.out.println("rows: " + rows);
        System.out.println("cols: " + cols);
        System.out.println();
        for (int i = 0; i < rows; i++) {
            int rowsSum = 0;
            for (int j = 0; j < cols; j++) {
                rowsSum += matrix[i][j];
            }
            System.out.println((i + 1) + " - row sum: " + rowsSum);

            double avg = (double) rowsSum / cols;
            System.out.println((i + 1) + " - avg: " + avg);

            int counter = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < avg) {
                    counter++;
                }
            }
            System.out.println("Count of elements that less than matrix's average number " + avg + " for "+ (i + 1) + " row: " + counter);
            System.out.print("--------------");
            System.out.println();
        }
    }
}
