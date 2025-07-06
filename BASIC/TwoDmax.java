package BASIC;

public class TwoDmax{
   
    public static void main(String[] args) {
        int[][] matrix = {
            {4, 7, 1},
            {8, 3, 9},
            {6, 2, 5}
        };

        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) max = matrix[i][j];
            }
        }

        System.out.println("Maximum in 2D array: " + max);
    }
}
 

