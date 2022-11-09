/** (Geometry: same line?) Programming Exercise 6.39 gives a method for testing
 whether three points are on the same line.
 Write the following method to test whether all the points in the array points are
 on the same line.
 public static boolean sameLine(double[][] points)
 Write a program that prompts the user to enter five points and displays whether
 they are on the same line. Here are sample runs: */
import java.util.*;
public class Exercise_08_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.println("Enter five points: ");
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[0].length; j++){
                points[i][j] = input.nextDouble();
            }
        }
        double x1 = points[0][0];
        double y1 = points[0][1];

        double slope = ((points[1][1]) - (points[0][1])) / ((points[1][0]) - (points[0][0]));
        double yInt = (slope * x1) - (y1);
        displayArray(points);

        if(sameLine(points, slope, yInt) || sameRow(points)){
            System.out.println("The five points are on the same line ");
            System.out.println("The Slope is => " + slope);
            System.out.println("The Y Intercept is => " + yInt);
        }else{
            System.out.println("The five points are NOT on the same line");
        }
    }
    public static boolean sameLine(double[][] points, double slope, double yInt){
        for(int i = 0; i < points.length; i++){
                if(points[i][1] != slope * (points[i][0]) + yInt)
                    return false;
        }
        return true;
    }
    public static void displayArray(double[][] points){
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[0].length; j++){
                System.out.print(points[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean sameRow(double[][] points){
        double y = points[0][1];
        for(int i = 0; i < points.length; i++){
            if(points[i][1] != y){
                return false;
            }
        }
        return true;
    }
}

