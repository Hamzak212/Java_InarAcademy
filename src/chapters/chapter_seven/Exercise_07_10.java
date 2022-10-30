/** (Find the index of the smallest element) Write a method that returns the index of
 the smallest element in an array of integers. If the number of such elements is
 greater than 1, return the smallest index. Use the following header:
 public static int indexOfSmallestElement(double[] array)
 Write a test program that prompts the user to enter ten numbers, invokes this
 method to return the index of the smallest element, and displays the index. */
import java.util.*;
public class Exercise_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double num;
        System.out.print("Enter ten numbers: ");

        for(int i = 0; i < numbers.length; i++){
            num = input.nextDouble();
            numbers[i] = num;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("The Index Of the smallest element is => " + indexOfSmallestElement(numbers));

    }
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];
        int minn = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
                minn = i;
            }
        }
        return minn;
    }
}

