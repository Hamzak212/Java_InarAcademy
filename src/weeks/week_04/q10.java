import java.util.Scanner;
public class q10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");

		int digit = input.nextInt();

		
				//989	89
		int a = digit / 100;
		int remainingamount = digit % 100;
		int b = remainingamount / 10;
		int c = remainingamount % 10;

		if(a == c){
			System.out.println(digit + " is a polindrome!");
		}else{
			System.out.println(digit + " is not a polindrome!");
		}
		}
}
