package exercise1;

import util.ArrayUtil;

/**
 * 2. m va n butun musbat sonlari berilgan.
 * mxn o'lchamli matritsani shunday hosil qilingki,
 * uning har bir j - ustuni elementlari 5 *j ga teng bo'lsin. (j=0, 1, ..., n − 1)
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j * 5;
            }
        }

        System.out.println("Matrix after changed: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
