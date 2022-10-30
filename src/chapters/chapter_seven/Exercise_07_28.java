/**(Math: combinations) Write a program that prompts the user to enter 10 integers
        and displays all combinations of picking two numbers from the 10. */
import java.util.*;
public class Exercise_07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create array with size 10
        int[] combination = new int[10];
        //prompt user to enter 10 numbers
        System.out.print("Enter ten integers to display combination: ");

        for(int i = 0; i < combination.length; i++){
            combination[i] = input.nextInt();
        }

        printCombination(combination);

    }
    public static void printCombination(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if (i != j)
                    System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
    }
}

