/* determines whether the second rectangle is inside the first or overlaps with the first, as shown
in Figure 3.9. Test your program to cover all cases. */
import java.util.Scanner;
public class q24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();

		System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();


		double x1_max = x1 + (w1 / 2);
		double y1_max = y1 + (h1 / 2);
		double x1_min = x1 - (w1 / 2);
		double y1_min = y1 - (h1 / 2);

		double x2_max = x2 + (w2 / 2);
		double y2_max = y2 + (h2 / 2);
		double x2_min = x2 - (w2 / 2);
		double y2_min = y2 - (h2 / 2);

			if((x1_max >= x2_max) && (y1_max >= y2_max) && (x1_min <= x2_min) && (y1_min <= y2_min)){
			System.out.println("r2 Is Inside r1!");

			}else if((x2_min > x1_max) || (x1_min > x2_max) || (y1_min > y2_max) && (y2_min >= y1_max)){
			System.out.println("r2 is not inside r1!");
			
			}else if((x1_max >= x2_max) || (y1_max >= y2_max) || (x1_min <= x2_min) || (y1_min <= y2_min)){
			System.out.println("r2 overlaps r1!");
			}

	}
}
