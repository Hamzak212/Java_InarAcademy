/** (Sum elements column by column) Write a method that returns the sum of all the
 elements in a specified column in a matrix using the following header:
        public static double sumColumn(double[][] m, int columnIndex)
 Write a test program that reads a 3-by-4 matrix and displays the sum of each column */
import java.util.*;
public class Exercise_08_01 {
    public static void main(String[] args) {
        double[][] array = getArray();


        for(int column = 0; column < array[0].length; column++){
            System.out.println("Sum of the elements at column " + (column + 1) + " is " + sumColumn(array, column));
        }

    }
    public static double[][] getArray(){
        double[][] array = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }
    public static double sumColumn(double[][] array, int columnIndex){
        double sum = 0;
        for(int row = 0; row < array.length; row++){
            sum += array[row][columnIndex];
        }
        return sum;
    }
}

