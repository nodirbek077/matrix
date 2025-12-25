import java.util.Arrays;
import java.util.Scanner;

/**
 * 14. m x n o'lchamli matritsa berilgan. Elementlari yig'indisi eng katta bo'lgan ustunning,
 * eng kichik elementini chiqaruvchi programma tuzilsin.
 */
public class Exercise14 {
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

        int[] sumsI = new int[n];
        for (int i = 0; i < n; i++) {
            int sumI = 0;
            for (int j = 0; j < m; j++) {
                sumI += matrix[i][j];
                sumsI[j] = sumI;
            }
        }
        System.out.println("Every rows sums as array: " + Arrays.toString(sumsI));

        /*//3. find min element from the smallest sums of rows
        int min = sumsI[0];
        for (int k : sumsI) {
            if (k < min) {
                min = k;
            }
        }

        System.out.println("minimum sum: " + min);

        //4. find the rows' index
        int index = 0;
        for (int i = 0; i < m; i++) {
            int sumI = 0;
            for (int j = 0; j < n; j++) {
                sumI += matrix[i][j];
            }

            if (sumI == min) {
                index = i;
            }
        }

        System.out.println("index: " + index);

        //5. Finally, need to find the largest element from that index of rows
        int maxI = matrix[index][0];

        //display every first element from every row
        System.out.println("First element from every row: " + maxI);
        for (int i = index; i <= index; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxI) {
                    maxI = matrix[i][j];
                }
            }
        }
        System.out.println("max: " + maxI);*/
    }
}
