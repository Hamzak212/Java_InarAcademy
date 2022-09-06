import java.util.Scanner;
public class q14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Package Weight -->  ");

		double weight = input.nextDouble();

		double cost_one = weight * 3.5;
		double cost_three = weight * 5.5;
		double cost_ten = weight * 8.5;
		double cost_twenty = weight * 10.5;

		if(weight <= 1){
			System.out.println("Your Weight Will Cost:  $" + ((100.0 * cost_one) / 100.0));
		}else if(weight <= 3 && weight > 1){
			System.out.println("Your Weight Will Cost:  $" + ((100.0 * cost_three) / 100.0));
		}else if(weight > 3 && weight <= 10){
			System.out.println("Your Weight Will Cost:  $" + ((100.0 * cost_ten) / 100.0));
		}else if(weight > 10 && weight <=20){
			System.out.println("Your Weight Will Cost:  $" + ((100.0 * cost_twenty) / 100.0));
		}else{
			System.out.println("MAX WEIGHT!");
		}

	}
}
