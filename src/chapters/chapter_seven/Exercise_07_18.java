/*********************************************************************************
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The     *
 * bubblesort algorithm makes several passes through the array. On each pass,     *
 * successive neighboring pairs are compared. If a pair is not in order, its      *
 * values are swapped; otherwise, the values remain unchanged. The technique is   *
 * called a bubble sort or sinking sort because the smaller values gradually      *
 * “bubble” their way to the top and the larger values “sink” to the bottom.      *
 * Write a test program that reads in ten double numbers, invokes the method,     *
 * and displays the sorted numbers.                                               *
 *********************************************************************************/
import java.util.*;
public class Exercise_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers to sort: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        bubbleSort(numbers);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void bubbleSort(double[] numbers){
        double temp;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
        }while(swapped);
    }
}

