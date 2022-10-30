/** (Sorted?) Write the following method that returns true if the list is already sorted
 in increasing order.
 public static boolean isSorted(int[] list)
 Write a test program that prompts the user to enter a list and displays whether
 the list is sorted or not. Here is a sample run. Note that the first number in the
 input indicates the number of the elements in the list. This number is not part
 of the list.  */
import java.util.*;
public class Exercise_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter list: ");
        int[] numbers = new int[input.nextInt()];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("The list is " + (isSorted(numbers) ? "already " : "not ") + "sorted");
    }
    public static boolean isSorted(int[] numbers){
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i + 1])
                return false;

        }
        return true;
    }
}

