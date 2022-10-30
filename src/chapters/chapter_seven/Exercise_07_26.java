/** (Strictly identical arrays) The arrays list1 and list2 are strictly identical
 if their corresponding elements are equal. Write a method that returns true if
 list1 and list2 are strictly identical, using the following header:
 public static boolean equals(int[] list1, int[] list2)
 Write a test program that prompts the user to enter two lists of integers and displays whether the two are strictly identical. Here are the sample runs. Note that
 the first number in the input indicates the number of the elements in the list. This
 number is not part of the list. */
import java.util.*;
public class Exercise_07_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t Array Identifier");
        System.out.println("\n\t\t|||||||||||||||||");

        System.out.print("\nEnter array size: ");
        int arraySize = input.nextInt();
        int[] list1 = new int[arraySize];
        int[] list2 = new int[arraySize];

        System.out.print("\nEnter First Array => ");
        for(int i = 0; i < arraySize; i++){
            list1[i] = input.nextInt();
        }
        System.out.print("\nEnter Second Array => ");
        for(int i = 0; i < arraySize; i++){
            list2[i] = input.nextInt();
        }

        System.out.println("Two lists are" + (equals(list1, list2) ? " " : " not ")
                + "strictly identical");
    }
    public static boolean equals(int[] list1, int[] list2){
        if(list1.length != list2.length) {
            return false;
        }
        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
