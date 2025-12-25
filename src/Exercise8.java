import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. m x n o'lchamli matritsa berilgan.
 * Matritsaning 2 ga karrali (0, 2, 4, ... ) satrlarini chiqaruvchi programma tuzilsin.
 * Shart operatori ishlatilmasin.
 */
public class Exercise8 {
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

        for (int i = 0; i < m; i += 2) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}