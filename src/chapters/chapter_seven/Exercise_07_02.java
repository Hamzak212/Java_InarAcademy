/** (Reverse the numbers entered) Write a program that reads ten integers and displays them in the
    reverse of the order in which they were read. */

import java.util.Scanner;
public class Exercise_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Amount Of Integers: ");
        int[] numbers = new int[input.nextInt()];

        System.out.print("\nEnter " + numbers.length + " Integers: ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        reverse(numbers);
        System.out.println();
    }
    public static void reverse(int[] numbers){
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }

}

