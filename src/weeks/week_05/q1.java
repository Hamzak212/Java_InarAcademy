import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 Points To Form A Triangle: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		//Compute Sides
		double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

		//Compute Angles
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c))); 
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

		System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0 + " " + Math.round(C * 100) / 100.0);

	}
}
