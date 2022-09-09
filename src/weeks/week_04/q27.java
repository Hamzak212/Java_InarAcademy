import java.util.Scanner;
public class q27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, and p2: (p0 & p1 is the line) ");

		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double line = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		if(line == 0){
			System.out.println("(" + x2 + ", " + y2 + ") Is On The Line (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}else if(line > 0){
			System.out.println("(" + x2 + ", " + y2 + ") Is On The Left Side of (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}else if(line < 0){
			System.out.println("(" + x2 + ", " + y2 + ") Is On The Right Side of (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
	}
}
