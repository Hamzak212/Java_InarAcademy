import java.util.Scanner;
public class q13 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

boolean triangle = true;
	if(triangle)	
		System.out.print("Enter Length of Triangle: ");

	else
		System.out.println("biy");

double length = input.nextDouble();

System.out.println("The area is " + ((Math.sqrt(3) / 4) * Math.pow(length, 2)));

}
	}
