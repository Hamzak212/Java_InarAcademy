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
double answer = ((Math.sqrt(3.0) / 4.0) * Math.pow(length, 2));

System.out.println("The area is " + answer);
System.out.println("The Volume is " + (answer * length));
}
	}
