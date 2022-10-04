//Write a program that lets the user enter the loan amount and loan period in number of years
//and displays the monthly and total payments for each interest rate starting from
//5% to 8%, with an increment of 1/8.
import java.util.Scanner;
public class fiveTwentyOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Loan Amount: ");
        double loan = input.nextDouble();
        System.out.println("Enter Number of Years: ");
        double years = input.nextDouble();

        System.out.println(
                "Interest Rate    Monthly Payment    Total Payment");
        System.out.println("__________________________________________________");

        for(double i = 5; i <= 8; i += 0.125){
            System.out.printf("%-5.3f",i);
            System.out.print("%           ");
            double MIR = i / 1200;
            double MonthlyPayment = loan * MIR / (1 - 1 / Math.pow(1 + MIR, years * 12));
            System.out.printf("%.2f",MonthlyPayment);
            System.out.print("             ");
            System.out.printf("%.2f",(MonthlyPayment * 12) * years);
            System.out.println();
        }

    }
}

