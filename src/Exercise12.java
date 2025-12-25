import java.util.Arrays;
import java.util.Scanner;

/**
 * 12. m x n o'lchamli matritsa berilgan.
 * Matritsa har bir ustunining eng katta elementini chiqaruvchi programma tuzilsin.
 */
public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("m (rows): ");
        int m = input.nextInt();

        System.out.print("n (columns): ");
        int n = input.nextInt();

        //1. insert elements to matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        //2. get all elements from this matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        int[] maxJs = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int maxJ = matrix[0][j];
                if (matrix[i][j] > maxJ) {
                    maxJ = matrix[i][j];
                    maxJs[j] = maxJ;
                }
            }
        }
        System.out.println(Arrays.toString(maxJs));
    }
}
