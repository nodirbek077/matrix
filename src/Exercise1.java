import java.util.Scanner;

/**
 * 1. m va n butun musbat sonlari berilgan.
 * m x n o'lchamli matritsani shunday hosil qilingki,
 * uning har biri - satri elementlari 10 * i ga teng bo'lsin. (i =0, 1, ..., m - 1)
 * Qator yoki satr: i
 * Ustun: j
 */
public class Exercise1 {
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

        System.out.println("The matrix after entering: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 10 * i;
            }
        }

        System.out.println("The matrix after changing: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}