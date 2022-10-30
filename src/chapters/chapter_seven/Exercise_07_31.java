/*********************************************************************************
 * (Merge two sorted lists) Write the following method that merges two sorted     *
 * lists into a new sorted list.                                                  *
 *                                                                                *
 * public static int[] merge(int[] list1, int[] list2)                            *
 *                                                                                *
 * Implement the method in a way that takes at most list1.length + list2.         *
 * length comparisons. Write a test program that prompts the user to enter two    *
 * sorted lists and displays the merged list. Here is a sample run. Note that the *
 * first number in the input indicates the number of the elements in the list.    *
 * This numberis not part of the list.                                            *
 *********************************************************************************/
import java.util.Scanner;

public class Exercise_07_31 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Array 1: \n\tLength: ");
        int listOneLength = input.nextInt();

        int[] list1 = new int[listOneLength];

        System.out.print("\tValues: ");
        for(int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }

        System.out.print("\nArray 2: \n\tLength: ");
        int listTwoLength = input.nextInt();

        int[] list2 = new int[listTwoLength];

        System.out.print("\tValues: ");
        for(int i = 0; i < list2.length; i++){
            list2[i] = input.nextInt();
        }

        //create list3
        int[] list3 = merge(list1, list2);

        //display list3
        for(int i = 0; i < list3.length; i++){
            System.out.print(list3[i] + " ");
        }

    }
    public static int[] merge(int[] list1, int[] list2){
        int[] list3 = new int[list1.length + list2.length];

        for(int i = 0; i < list1.length; i++){
            list3[i] = list1[i];
        }
        for(int i = 0, j = list1.length; i < list2.length; i++, j++){
            list3[j] = list2[i];
        }
        sort(list3);

        return list3;
    }
    public static void sort(int[] list3){
        for(int i = 0; i < list3.length - 1; i++){
            int min = list3[i];
            int minIndex = i;

            for(int j = i + 1; j < list3.length; j++){
                if(list3[j] < min){
                    min = list3[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                list3[minIndex] = list3[i];
                list3[i] = min;
            }
        }
    }
}
