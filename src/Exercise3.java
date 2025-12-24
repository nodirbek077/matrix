import java.util.Arrays;
import java.util.Scanner;

/**
 * 3. m va n butun musbat sonlari va m ta butun sonlar to'plami berilgan.
 * m x n o'lchamli matritsani shunday hosil qilingki,
 * uning har bir ustuni kiritilgan m ta sondan iborat bo'lsin.
 */
public class Exercise3 {
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

        int[] numsM = new int[m];
        System.out.println("Enter " + m +" element(s).");
        for (int i = 0; i < m; i++) {
            System.out.print("Enter " + i +" - element: ");
            numsM[i] = input.nextInt();
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
                matrix[i][j] = numsM[i];
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
