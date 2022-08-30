import java.util.Scanner;
	public class q1 {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Salary Amount: ");
		double salary = input.nextDouble();

		System.out.print("Enter Years of Service: ");
		double service = input.nextDouble();

		double bonus = (((salary / 100.0) * 0.05) * 100.0);

		if (service > 5){
			System.out.println("Congrats Your Bonus is " + bonus + " !!" + "\nYour New Salary Is " + (((bonus + salary) * 100.0) / 100.0));
		}else{
			System.out.println("Sorry, You Are Not Eligible For a Bonus");
		}

		
	}
}
