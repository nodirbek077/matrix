public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 9},
                {4, 19, 10}
        };

//        matrix[0][2] = 5 * matrix[0][2];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if (j == 0){
                    matrix[i][j] = 11;
                }
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }

//        System.out.println(matrix[0][1]);
    }
}
