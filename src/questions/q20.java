import java.util.Scanner;
public class q20 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a 4 Digit Number: ");

int number = input.nextInt();

int number1 = number / 1000;
int remainingamount = number % 1000;

int number2 = remainingamount / 100;
int remainingamount1 = remainingamount % 100;

int number3 = remainingamount1 / 10;
int remainingamount2 = remainingamount % 10;

int number4 = remainingamount2;

System.out.println(number4 + "" + number3 + number2 + number1);
}
}
