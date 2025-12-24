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
        System.out.print("Enter the number m: ");
        int m = input.nextInt();

        System.out.print("Enter the number n: ");
        int n = input.nextInt();

        System.out.print("Enter the number d: ");
        int d = input.nextInt();

        int[] numsM = new int[m];
        System.out.println("Enter " + m + " element(s).");
        for (int i = 0; i < m; i++) {
            System.out.print("Enter " + i + " - element: ");
            numsM[i] = input.nextInt();
        }

        System.out.println("Elements that you entered are: ");
        for (int i = 0; i < m; i++) {
            System.out.print(numsM[i] + " ");
        }

        int[][] matrix = new int[m][n];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    matrix[i][j] = numsM[i-1];
                } else {
                    matrix[i][j] = matrix[i][j] + d;
                }
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
