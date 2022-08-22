import java.util.*;

public class q5 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Question 1: (5.5 * (r + 2.5) ^2.5 + t)");
	System.out.print("Enter two digits for t and r!  --->  ");
	double t = input.nextDouble();
	double r = input.nextDouble();
	
	double answer = 5.5 * Math.pow(r + 2.5, 2.5 + t);


	System.out.println("If t is " + t + " and r is " + r + " then, 5.5 * (r + 2.5) ^2.5 + t) is equal to " + answer +  "!!!");
}
	
}
