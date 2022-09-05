import java.util.Scanner;
public class q3 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter An Age For Ticket Prices: ");

	int age = input.nextInt();

	System.out.println((age >= 16) ? "Ticket Price $20." : "Ticket Prices 10.");


	}
}
