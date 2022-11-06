/** (Largest row and column) Write a program that randomly fills in 0s and 1s into
 a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 most 1s. Here is a sample run of the program:
 0011
 0011
 1101
 1010
 The largest row index: 2
 The largest column index: 2 */
import java.util.*;
public class Exercise_08_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        fillArrayRandomly(matrix);

        displayMatrix(matrix);

        System.out.println("The largest row index " + largestRow(matrix));
        System.out.println("The largest column index " + largestColumn(matrix));
    }

    public static void fillArrayRandomly(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                matrix[row][column] = (int) (Math.random() * 2);
            }
        }
    }
    public static void displayMatrix(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix.length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
    public static int largestRow(int[][] matrix){
        int max = 0;
        int maxRowIndex = 0;
        for(int row = 0; row < matrix.length; row++){
            int count = 0;
            for(int column = 0; column < matrix[row].length; column++){
                if(matrix[row][column] == 1){
                    count++;
                }
            }
            if(count > max){
                max = count;
                maxRowIndex = row;
            }
        }
        return maxRowIndex;
    }
    public static int largestColumn(int[][] matrix){
        int max = 0;
        int maxIndex = 0;
        for(int column = 0; column < matrix.length; column++){
            int count = 0;
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][column] == 1){
                    count++;
                }
            }
            if(count > max){
                max = count;
                maxIndex = column;
            }
        }
        return maxIndex;
    }
}

