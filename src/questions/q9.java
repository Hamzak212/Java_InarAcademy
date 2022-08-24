import java.util.Scanner; 
public class q9 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter Total Amount of Money As Decimal: ");

double amount = input.nextDouble();

int remainingAmount = (int)(amount * 100);

int onedollars =remainingAmount / 100;
remainingAmount = remainingAmount % 100;

int quarters = remainingAmount / 25;
remainingAmount = remainingAmount % 25;

int dimes = remainingAmount / 10;
remainingAmount = remainingAmount % 10;

int pennies = remainingAmount;



System.out.println("Your total amount " + amount + " consists of " + onedollars + " dollars " + quarters + " quarters " + dimes + " dimes " + " and " + pennies + " pennies!" );
}

	}
