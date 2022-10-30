/** (Eliminate duplicates) Write a method that returns a new array by eliminating the
 duplicate values in the array using the following method header:
 public static int[] eliminateDuplicates(int[] list)
 Write a test program that reads in ten integers, invokes the method, and displays the result. */

import java.util.*;
public class Exercise_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 Integers to Remove Duplicates: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The distinct numbers are: " + Arrays.toString(eliminateDuplicates(numbers)));
        printArray(eliminateDuplicates(numbers));
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int tempIndex = 0;
        int duplicate = list[0];
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < list.length; k++) {
                if (list[i] == list[k]) {
                    isDuplicate = true;
                }
            }
            if (!isDuplicate) {
                temp[tempIndex++] = list[i];
            }
        }
        int[] trimmedArray = new int[tempIndex];
        for (int i = 0; i < tempIndex; i++) {
            trimmedArray[i] = temp[i];
        }

        return trimmedArray;
    }
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%2d ", array[i]);
            if ((i + 1) % 10 == 0) System.out.println("");
        }
    }
}


