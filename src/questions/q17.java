import java.util.Scanner;
public class q17 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter a number between 0 and 1000: ");

double number = input.nextDouble();


int remainingamount = (int)(number / 10);
int digit_one = (int)(number % 10);



int digit_two = remainingamount % 10;
int remainingamountt = remainingamount / 10;




int digit_three = remainingamountt;

System.out.println("The multiplication of all digits in " + number + " is " + digit_one * digit_two * digit_three);












}
	}
