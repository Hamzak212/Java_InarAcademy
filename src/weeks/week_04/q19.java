
import java.util.Scanner;

public class q19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		// Prompt the user to enter a point
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		// Check whether the point is within the rectangle
		// width 10 and height 5

		boolean withinRectangle = (x <= 5 ) || (y <= 2.5);


		// Display results
		System.out.println("Point (" + x + ", "+ y + ") is " + ((withinRectangle) ? "in " : "not in ") + "the rectangle"); 
	}
}
