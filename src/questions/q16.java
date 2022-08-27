import java.util.Scanner;
public class q16 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("This Is Gratuity Tip Calculator!");

System.out.print("Please Enter Total Cost: ");
double total = input.nextDouble();

System.out.print("Please Enter Gratuity Tip: ");
double tip = input.nextDouble();

double gratuity = (tip / 100.0) * (total);
double totalprice = gratuity + total;

System.out.println("The gratuity is " + gratuity + "$" + " and the total price is " + totalprice);

}
	}
