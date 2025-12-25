import java.util.Arrays;
import java.util.Scanner;

/**
 * 11. m x n o'lchamli matritsa berilgan.
 * Matritsaning har bir satri elementlari yig'indisini chiqaruvchi programma tuzilsin.
 */
public class Exercise11 {
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

        int[] sumsI = new int[m];
        for (int i = 0; i < m; i++) {
            int sumI = 0;
            for (int j = 0; j < n; j++) {
                sumI += matrix[i][j];
                sumsI[i] = sumI;
            }
        }
        System.out.println(Arrays.toString(sumsI));
    }
}
