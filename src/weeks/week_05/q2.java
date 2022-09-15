
import java.util.*;
public class q2{ 
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("What Is Your Score: ");
	System.out.println("What Is Your Pay: ");
	double score = input.nextDouble();
	double pay = input.nextDouble();
	double raise = (pay * 0.03) + pay;

	if(score > 90){
		System.out.printf("Your Score %.2f%n Makes Your Pay $ %.2f%n to $ %.2f%n", score, pay, raise);
	}else{
		System.out.println("NO RAISE");
	}

	
	
	}
}




