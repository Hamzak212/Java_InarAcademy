import java.util.Scanner;
public class q17 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates:  ");

		double x = input.nextInt();
		double y = input.nextInt();


		boolean formula = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);


		if(formula){
			System.out.println("Point (" + x + ", " + y + ") is in the circle!");
		}else{
			System.out.println("Point (" + x + ", " + y + ") is NOT in the circle!");
		}
	}
}
