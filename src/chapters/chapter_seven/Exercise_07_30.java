/** (Pattern recognition: consecutive four equal numbers) Write the following
 method that tests whether the array has four consecutive numbers with the same
 value.
 public static boolean isConsecutiveFour(int[] values)
 Write a test program that prompts the user to enter a series of integers and displays if the series contains four
 consecutive numbers with the same value. Your program should first prompt the user to enter the input size—i.e.,
 the number of values in the series.  */
import java.util.*;
public class Exercise_07_30 {
    public static void main(String[] args) {
        System.out.println("(Pattern recognition: consecutive four equal numbers)");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the array size => ");
        int arraySize = input.nextInt();
        int[] numbers = new int[arraySize];
        System.out.print("\nEnter the values: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        if(isConsecutiveFours(numbers)){
            System.out.println("The list has consecutive fours");
        }else{
            System.out.println("The list has no consecutive fours");
        }


    }
    public static boolean isConsecutiveFours(int[] numbers){
        int count = 1;
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] == numbers[i + 1])
                count++;

            if(count >= 4)
                return true;

            if(numbers[i] != numbers[i + 1])
                count = 1;

        }
        return false;
    }
}

