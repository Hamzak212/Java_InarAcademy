//week3_q2.java
//Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.Scanner;
	public class q2 {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Age of Three People:  ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int min;
		int max;
		int mid;

		// a = 5   b = 10   c = 15

		if (a > b) {
			min = b;
		}else{
			min = a;
		}
		if (min < c) {
			min = min;
		}else{
			min = c;
		}


		if (b > a){
			max = b;
		}else{
			max = a;
		}
		if(max > c){
			max = max;
		}else{
			max = c;
		}


		if ((a != min) && (a != max)){
			mid = a;
		}else if((b != min) && (b != max)){
			mid = b;
		}else{
			mid = c;
		}

		System.out.println("Your Three Ages Are " + a + ", " + b + " and " + c + "!");
		System.out.print("\nLowest Age: " + min + "\nMiddle Age: " + mid + "\nHighest Age: " + max + "\n");

		}
		
	}
