/** (Random number chooser) Write a method that returns a random number between
 1 and 54, excluding the numbers passed in the argument. The method header is
 specified as follows:
 public static int getRandom(int... numbers) */
import java.util.*;
public class Exercise_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers to exclude from random (1-54): ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("Number Generated: " + getRandom(numbers));
    }
    public static int getRandom(int[] numbers){
        int random = (int) (1 + Math.random()* 54);
        for(int i = 0; i < numbers.length; i++){
            if(random == numbers[i]){
                random = (int)(Math.random() * 54 + 1);
                i = -1;
            }
        }
        return random;
    }
}

