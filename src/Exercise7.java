import java.util.Arrays;
import java.util.Scanner;

/**
 * 7. m x n o'lchamli matritsa va k soni berilgan (0 <= k < n ).
 * Matritsaning k- ustuni elementlarini chiqaruvchi programma tuzilsin.
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("m (rows): ");
        int m = input.nextInt();

        System.out.print("n (columns): ");
        int n = input.nextInt();

        System.out.print("k (0 <= k < n): ");
        int k = input.nextInt();

        if (k < 0) {
            System.out.print("k must be equal or greater than zero");
            return;
        }

        if (k >= n) {
            System.out.print("k must be less than n");
            return;
        }

        //1. insert elements to matrix
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        //2. get k-elements from this matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        int[] kRows = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                kRows[i] = matrix[i][j];
//                System.out.print(matrix[0][j] + "\t");
            }
        }

        System.out.println(Arrays.toString(kRows));

    }
}
