/** (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
 The selection-sort method repeatedly finds the smallest number in the current
 array and swaps it with the first. Rewrite this program by finding the largest
 number and swapping it with the last. Write a test program that reads in ten double
 numbers, invokes the method, and displays the sorted numbers. */
import java.util.*;
public class Exercise_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.println("Enter numbers to Sort: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        selectionSort(numbers);

        for (double e: numbers)
            System.out.print(e + " ");
        System.out.println();

    }
    public static void selectionSort(double[] numbers){

        for (int i = numbers.length - 1; i >= 0; i--) {
            double max = numbers[i];
            int maxIndex = i;
            for(int j = i - 1; j >= 0; j--){
                if(max < numbers[j]){
                    max = numbers[j];
                    maxIndex = j;
                }
            }
            if(maxIndex != i){
                numbers[maxIndex] = numbers[i];
                numbers[i] = max;
            }
        }
    }
}

