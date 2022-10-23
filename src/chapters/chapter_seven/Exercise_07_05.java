/** (Print distinct numbers) Write a program that reads in ten numbers and displays
        the number of distinct numbers and the distinct numbers separated by exactly one
        space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
        Read a number and store it to an array if it is new. If the number is already in the
        array, ignore it.) After the input, the array contains the distinct numbers.  */
import java.util.Scanner;
public class Exercise_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers to display distinct numbers => ");
        int[] numbers = new int[10];
        int num;
        int count = 0;
        //put numbers into array
        for(int i = 0; i < numbers.length; i++){
            num = input.nextInt();
            if(isDistinct(numbers, num)){
                numbers[count] = num;
                count++;
            }
        }
        System.out.print("\nThe number of distinct number is " + count);
        System.out.print("\nThe distinct numbers are: ");
        //display
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
    public static boolean isDistinct(int[] numbers, int num){
        for(int i = 0; i < numbers.length; i++){
            if(num == numbers[i]){
                return false;
            }
        }
        return true;
    }
}

