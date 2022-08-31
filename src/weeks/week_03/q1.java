import java.util.Scanner;
	public class q1 {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Salary Amount: ");
		double salary = input.nextDouble();

		System.out.print("Enter Years of Service: ");
		double service = input.nextDouble();

		double bonus = (((salary / 100.00) * 0.05) * 100.00);

		if (service > 5){
			System.out.println("Congrats Your Bonus is " + ((bonus * 100.00) / 100.00) + " !!" + "\nYour New Salary Is " + (((bonus + salary) * 100.00) / 100.00));
		}else{
			System.out.println("Sorry, You Are Not Eligible For a Bonus");
		}

		
	}
}
