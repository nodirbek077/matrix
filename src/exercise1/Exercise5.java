package exercise1;

import java.util.Scanner;

/**
 * 5. m, n va d butun sonlari va m ta butun sonlar to'plami berilgan.
 * m x n o'lchamli matritsani shunday hosil qilingki,
 * uning birinchi ustuni kiritilgan m ta sondan iborat bo'lsin.
 * Qolgan ustunlari, o'zidan bir oldingi ustunning o'zi turgan satri elementi qiymatiga
 * d sonini qo'shishdan hosil bo'lsin.
 * (Natijada har bir satrda arifmetik progressiya hosil bo'ladi)
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("m (rows): ");
        int m = input.nextInt();

        System.out.print("n (columns): ");
        int n = input.nextInt();

        System.out.print("d (difference): ");
        int d = input.nextInt();

        int[] firstCol = new int[m];
        System.out.print("Enter " + m + " element(s): ");
        for (int i = 0; i < m; i++) {
            firstCol[i] = input.nextInt();
        }

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            matrix[i][0] = firstCol[i];

            for (int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i][j - 1] + d;
            }
        }

        System.out.println();
        System.out.println("The matrix after changing: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
