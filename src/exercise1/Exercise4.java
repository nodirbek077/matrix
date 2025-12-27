package exercise1;

import java.util.Scanner;

/**
 * 4. m va n butun musbat sonlari va n ta butun sonlar to'plami berilgan.
 * m x n o'lchamli matritsani shunday hosil qilingki,
 * uning har bir satri kiritilgan n ta sondan iborat bo'lsin.
 */
public class Exercise4 {
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

        int[] numsN = new int[n];
        System.out.println("Enter " + n + " element(s).");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " - element: ");
            numsN[i] = input.nextInt();
        }

        System.out.println("The matrix after entering: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Elements that you entered are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numsN[i] + " ");
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = numsN[j];
            }
        }

        System.out.println();
        System.out.println("The matrix after changing: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
