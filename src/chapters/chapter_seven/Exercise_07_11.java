/** (Statistics: compute deviation) Programming Exercise 5.45 computes the standard deviation of numbers. This exercise uses a different but equivalent formula to
compute the standard deviation of n numbers.
Compute the deviation of double values
public static double deviation(double[] x)
Compute the mean of an array of double values
public static double mean(double[] x)
Write a test program that prompts the user to enter ten numbers and displays the
mean and standard deviation, as shown in the following sample run: */
import java.util.Scanner;
public class Exercise_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter Ten Numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        System.out.printf("\nThe Mean is %.2f", mean(numbers));
        System.out.printf("\nThe Standard Deviation is %.5f", deviation(numbers));
        System.out.println();
    }
    public static double deviation(double[] x){
        double mean = mean(x);
        double deviation = 0;
        for (int i = 0; i < x.length; i++) {
            deviation += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }
    public static double mean(double[] x){
        double total = 0;
        for(int i = 0; i < x.length; i++){
            total += x[i];
        }
        return total/x.length;
    }
}

