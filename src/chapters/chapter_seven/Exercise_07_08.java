/** (Find the smallest element) Write a method that finds the smallest element in an
 array of double values using the following header:
 public static double min(double[] array)
 Write a test program that prompts the user to enter ten numbers, invokes this
 method to return the minimum value, and displays the minimum value. */

import java.util.*;
public class Exercise_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        double num;

        System.out.print("Enter ten values to check for Minimum: ");
        for (int i = 0; i < array.length; i++) {
            num = input.nextDouble();
            array[i] = num;
        }
        System.out.println("The minimum number is: " + min(array));
        System.out.println(Arrays.toString(array));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            double val = array[i];
            if (val < min) {
                min = val;
            }
        }
        return min;
    }
}

