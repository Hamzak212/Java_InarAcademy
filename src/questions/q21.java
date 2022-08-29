import java.util.Scanner;

public class q21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int min;
		int max;
		int med;

		if (a < b) {
			min = a; 
		}else{
			min = b; 
		}
		
		if(min < c) {
			min = min;
		}else{
			min = c;
		}
		

		if (a > b){
			max = a;
		}else{
			max = b;
		}

		if(max > c) {
			max = max;
		}else{
			max = c;
		}


		if ((a!= min) && (a!= max)){
			med = a;
		}else if((b!= min) && (b!= max)){
			med = b;
		}else{
			med = c;
		}
		
		System.out.println("Minumum = " + min + "\nMedium = " + med + "\nMaximum = " + max);
		//a=34 b=56 c=40


}
}
