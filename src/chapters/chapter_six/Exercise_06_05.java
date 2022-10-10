//(Sort three numbers) Write a method with the following header to display three numbers in increasing order:
//public static void displaySortedNumbers(double num1, double num2, double num3)
import java.util.Scanner;
public class Exercise_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Minimum , Middle, Maximum Calculator: ");
        System.out.print("\n\tEnter Number 1: ");
        double num1 = input.nextDouble();
        System.out.print("\n\tEnter Number 2: ");
        double num2 = input.nextDouble();
        System.out.print("\n\tEnter Number 3: ");
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
        System.out.println("Smallest\t \t \tHighest");
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp;

        if(num2 < num1 && num2 < num3){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }else if(num3 < num2 && num3 < num1){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if(num3 < num2){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1 + " \t\t " + num2 + "\t\t" + num3);
    }
}

