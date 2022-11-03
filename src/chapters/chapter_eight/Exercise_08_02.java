/** (Sum the major diagonal in a matrix) Write a method that sums all the numbers
 in the major diagonal in an n * n matrix of double values using the following
 header:
 public static double sumMajorDiagonal(double[][] m)
 Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 elements on the major diagonal. */
import java.util.*;
public class Exercise_08_02 {
    public static void main(String[] args) {
        double[][] array = getArray();

        System.out.printf("Sum of the elements in the major diagonal is %.1f", sumMajorDiagonal(array));

    }
    public static double[][] getArray(){
        double[][] array = new double[4][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array.length; column++){
                array[row][column] = input.nextDouble();
            }
        }
        return array;
    }
    public static double sumMajorDiagonal(double[][] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i][i];
        }
        return sum;
    }
}
