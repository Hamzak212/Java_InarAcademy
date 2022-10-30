/*********************************************************************************
 * (Identical arrays) The arrays list1 and list2 are identical if they have the   *
 * same contents. Write a method that returns true if list1 and list2 are         *
 * identical, using the following header:                                         *
 *                                                                                *
 * public static boolean equals(int[] list1, int[] list2)                         *
 *                                                                                *
 * Write a test program that prompts the user to enter two lists of integers and  *
 * displays whether the two are identical. Here are the sample runs. Note that    *
 * the first number in the input indicates the number of the elements in the list.*
 * This number is not part of the list.                                           *
 *********************************************************************************/
import java.util.*;
public class Exercise_07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int arraySize = input.nextInt();

        int[] list1 = new int[arraySize];
        int[] list2 = new int[arraySize];

        System.out.print("\nEnter First Array => ");
        for(int i = 0; i < arraySize; i++){
            list1[i] = input.nextInt();
        }

        System.out.print("\nEnter Second Array => ");
        for(int i = 0; i < arraySize; i++){
            list2[i]= input.nextInt();
        }

        if(equals(list1, list2)){
            System.out.println("Two lists are identical");
        }else{
            System.out.println("Two lists are not identical");
        }

    }
    public static boolean equals(int[] list1, int[] list2){
        int firstList = 0;
        int secondList = 0;
        for(int i = 0; i < list1.length; i++){
            firstList += list1[i];
        }

        for(int i = 0; i < list2.length; i++){
            secondList += list2[i];
        }
        if(firstList != secondList){
            return false;
        }
        return true;
    }
}

