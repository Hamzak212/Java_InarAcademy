//Write a program that prompts the user to enter an amount (e.g., 100), the annual
//interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount
//in the savings account after the given month.
import java.util.Scanner;
public class fiveThirty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Saving Amount/Month: ");
        double amount = input.nextDouble();
        System.out.println("Enter Annual Interest Rate:  ");
        double interestRateYear = input.nextDouble();
        System.out.println("Enter Number of Months: ");
        double amountOfMonths = input.nextDouble();


        double sum = 0;
        for (double months = 1; months <= amountOfMonths; months++) {
            sum = ((amount + sum) * (1 + (interestRateYear / 100) / 12));
        }
        System.out.printf("Saving Account Balance(" + amountOfMonths + " Month):" + "  $%.3f",sum);

    }
}

