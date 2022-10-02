//Write a program that prompts the user to enter two positive integers and displays the gcd.
import java.util.Scanner;
public class fiveFourteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number One(GCD): ");
        int num1 = input.nextInt();
        System.out.println("Enter Number Two(GCD): ");
        int num2 = input.nextInt();

        //make number1 < number2

        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int gcd = 0;
        int i = num1;
        while(i <= num1 && i <= num2){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
                break;
            }
            i--;
        }

        System.out.println("The Greatest Common Divisor For " + num1 + " & " + num2 + " = " + gcd);
    }
}

