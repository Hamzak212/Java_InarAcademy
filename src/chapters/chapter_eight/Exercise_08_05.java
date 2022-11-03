/*********************************************************************************
 * (Algebra: add two matrices) Write a method to add two matrices. The header of  *
 * the method is as follows:                                                      *
 *                                                                                *
 * public static double[][] addMatrix(double[][] a, double[][] b)                 *
 *                                                                                *
 * In order to be added, the two matrices must have the same dimensions and the   *
 * same or compatible types of elements. Let c be the resulting matrix. Each      *
 * element cij is aij + bij.                                                      *
 * Write a test program that prompts the user to enter two 3 * 3 matrices and     *
 * displays their sum.                                                            *
 *********************************************************************************/
import java.util.*;
public class Exercise_08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrixOne = getMatrix(1);
        double[][] matrixTwo = getMatrix(2);

        double[][] matrixThree = addMatrix(matrixOne, matrixTwo);

        print(matrixOne, matrixTwo, matrixThree);
    }

    public static double[][] getMatrix(int n){
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter new 3-by-3 Matrix " + n + ": ");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] c = new double [3][3];
        for(int row = 0; row < c.length; row++){
            for(int column = 0; column < c.length; column++){
                c[row][column] = a[row][column] + b[row][column];
            }
        }
        return c;
    }
    public static void print(double[][] m1, double[][] m2, double[][] m3){
        System.out.println("The matrices are added as follows");

        for(int i = 0; i < 3; i++){
            print(m1, i);
            System.out.print((i == 1 ? "  +  " : "     "));
            print(m2, i);
            System.out.print((i == 1 ? "  =  " : "     "));
            print(m3, i);
            System.out.println();
        }
    }
    public static void print(double[][] m2, int i){
        for(int j = 0; j < m2.length; j++){
            System.out.print(m2[i][j] + " ");
        }
    }
}

