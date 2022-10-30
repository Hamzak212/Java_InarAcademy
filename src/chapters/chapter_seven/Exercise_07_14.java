/** (Computing gcd) Write a method that returns the gcd of an unspecified number
 of integers. The method header is specified as follows:
 public static int gcd(int... numbers)
 Write a test program that prompts the user to enter five numbers, invokes the
 method to find the gcd of these numbers, and displays the gcd. */
import java.util.*;
public class Exercise_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 Numbers to find GCD: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("The GCD is: " + gcd(numbers));
    }
    public static int gcd(int... numbers) {
        int gcd = 1;
        int min = getMin(numbers);
        int length = numbers.length - 1;

        int count = 0;
        for (int i = 2; i <= min; i++) {

            for (int k = 0; k <= length; k++) {
                if (numbers[k] % i == 0) {
                    count++;
                    if (count == length) gcd = i;
                } else {
                    count = 0;
                }
            }
        }

        return gcd;
    }
    public static int getMin(int[] numbers){
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}

