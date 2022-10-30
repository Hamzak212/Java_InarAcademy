/** (Reverse an array) The reverse method in Section  7.7 reverses an array by
 copying it to a new array. Rewrite the method that reverses the array passed in
 the argument and returns this array. Write a test program that prompts the user to
 enter ten numbers, invokes the method to reverse the numbers, and displays the
 numbers. */
import java.util.*;
public class Exercise_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        //put numbers into initial array
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        System.out.println("\n" + Arrays.toString(reverse(numbers)));
        System.out.println();
    }



    /** Method reverse reverses the array passed in the argument */

    public static double[] reverse(double[] list) {
        int temp;
        for (int i = 0, j = list.length - 1; i < list.length / 2; i++, j--) {
            temp = (int) list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        return list;
    }
}

