import java.util.Scanner;
public class q15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 3 Edges Of Triangle: ");


		System.out.println("Edge 1 points x, y: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Edge 2 points x, y: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		System.out.println("Edge 3 points x, y: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) || (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) || (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);


		if(!valid){
			System.out.println("Not Valid.");
		}else{
			System.out.println("perimeter of triangle is " + (side1 + side2 + side3));
		}
	}
}
