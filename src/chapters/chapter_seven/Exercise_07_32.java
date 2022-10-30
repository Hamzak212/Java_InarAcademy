/** (Partition of a list) Write the following method that partitions the list using the
        first element, called a pivot.
public static int partition(int[] list)
        After the partition, the elements in the list are rearranged so that all the elements
        before the pivot are less than or equal to the pivot and the elements after the pivot
        are greater than the pivot. The method returns the index where the pivot is located
        in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition, the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes
        at most list.length comparisons. Write a test program that prompts the user
        to enter a list and displays the list after the partition. Here is a sample run. Note
        that the first number in the input indicates the number of the elements in the list.
        This number is not part of the list. */
import java.util.*;
public class Exercise_07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array count: ");
        int[] array = new int[input.nextInt()];

        System.out.print("\nEnter list: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        int partition = partition(array);
        System.out.println();
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // [7, 2, 1, 8, 6, 3, 5, 4]

    public static int partition(int[] list){
        int first = 0;
        int low = first + 1;
        int high = list.length - 1;
        int pivot = list[first];

        while (high > low) {

            while (low <= high && list[low] <= pivot) low++;
            while (low <= high && list[high] > pivot) high--;

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high >= low && list[high] >= pivot) high--;

        if (high > first) {
            int temp = list[high];
            list[high] = list[first];
            list[first] = temp;
            return high;
        } else {
            return first;
        }


    }
}

