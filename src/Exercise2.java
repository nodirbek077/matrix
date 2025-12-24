import java.util.Arrays;
import java.util.Scanner;

/**
 * 2. m va n butun musbat sonlari berilgan.
 * mxn o'lchamli matritsani shunday hosil qilingki,
 * uning har bir j - ustuni elementlari 5 *j ga teng bo'lsin. (j=0, 1, ..., n − 1)
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number m: ");
        int m = input.nextInt();

        System.out.print("Enter the number n: ");
        int n = input.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter matrix (" + i + "," + j + ") element: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix after entering: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

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
