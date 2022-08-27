import java.util.Scanner;
public class q15 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("We are converting square meter to ping!");

System.out.print("Enter a number in square meters: ");
double sqmeter = input.nextDouble();
double result = sqmeter * 0.3025;

System.out.println(sqmeter + " square meters is " + result + " pings!");
}
	}
