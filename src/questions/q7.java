import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a -->  ");
	double a = input.nextDouble();

	System.out.print("Enter b -->  ");
        double b = input.nextDouble();

	System.out.print("Enter c -->  ");
        double c = input.nextDouble();
	
	
	
	double answer = ((-b + Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / (2 * a));
	
	double answerr = ((-b - Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / (2 * a));

	System.out.println("Your Answer is  " + ((int)(answer * 100) / 100.0));
	System.out.println("Your other answer is  " + ((int)(answerr * 100) / 100.0));
}
	}
