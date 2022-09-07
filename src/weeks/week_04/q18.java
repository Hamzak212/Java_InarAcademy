import java.util.Scanner;

public class q18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		// Prompt the user to enter a point
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		// Check whether the point is within the rectangle
		// width 10 and height 5

		boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10.0 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);


		// Display results
		System.out.println("Point (" + x + ", "+ y + ") is " + ((withinRectangle) ? "in " : "not in ") + "the rectangle"); 
	}
}
