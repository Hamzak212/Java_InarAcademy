import java.util.Scanner;
public class q23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point's x- and y-coordinates: ");

		double x = input.nextDouble();
		double y = input.nextDouble();
		
	

		

		double y_ans = -0.5 * x + 100 - y;
		double x_ans = -0.5 * x + 100 - y;

	

		if(y_ans >= 0 && x_ans >= 0){
			System.out.println("Your Points (" + x + ", " + y + ") Is IN The Triangle!");
		}else{
			System.out.println("Your Points (" + x + ", " + y + ") Is NOT In The Triangle!");



		}
		
	}
}
