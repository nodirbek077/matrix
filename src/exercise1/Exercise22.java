package exercise1;

import util.ArrayUtil;

/**
 * 22. m x n o'lchamli matritsa berilgan.
 * Faqat juft sonlardan iborat bo'lgan oxirgi satr nomerini aniqlovchi programma tuzilsin.
 * Agar bunday satr bo'lmasa, "Bunday satr yo'q" deb chiqarilsin.
 */
public class Exercise22 {
    public static void main(String[] args) {
        int[][] matrix = ArrayUtil.getArrayElements();

        int lastEvenRowIndex = -1;

        for (int i = matrix.length - 1; i >= 0; i--) {
            boolean allEven = true;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }

            if (allEven) {
                lastEvenRowIndex = i;
                break;
            }
        }

        if (lastEvenRowIndex != -1){
            System.out.println("Last even row index: " + lastEvenRowIndex);
        }else {
            System.out.println("There is no even row in this array");
        }
    }
}
