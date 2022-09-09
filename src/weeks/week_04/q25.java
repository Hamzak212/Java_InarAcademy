import java.util.Scanner;
public class q25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//ask for input
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();

		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();

		//distance between 2 points

		double distance = Math.sqrt(Math.abs((y2 - y1) * (y2 - y1)) + Math.abs((x2 - x1) * (x2 - x1)));

		if(distance <= (Math.abs(r1 - r2))){
			System.out.println("circle2 is inside circle1!");
		}else if(distance <= (r1 + r2)){
			System.out.println("circle2 overlaps circle1!");
		}else{
			System.out.println("Not Inside!");
		}



	}
}
