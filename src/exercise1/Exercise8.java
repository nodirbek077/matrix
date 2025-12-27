package exercise1;

import util.ArrayUtil;

import java.util.Scanner;

/**
 * 8. m x n o'lchamli matritsa berilgan.
 * Matritsaning 2 ga karrali (0, 2, 4, ... ) satrlarini chiqaruvchi programma tuzilsin.
 * Shart operatori ishlatilmasin.
 */
public class Exercise8 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();

        System.out.println();

        for (int i = 0; i < matrix.length; i += 2) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}