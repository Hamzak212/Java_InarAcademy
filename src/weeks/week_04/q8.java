import java.util.Scanner;
public class q8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Three Integers:  ");

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int min;
		int mid;
		int max;


		if(a > b && a > c){
			max = a;
		}else if(b > a && b > c){
			max = b;
		}else{
			max = c;
		}

		if(a < b && a < c){
			min = a;
		}else if(b < a && b < c){
			min = b;
		}else{
			min = c;
		}

		if(a != max && a != min){
			mid = a;
		}else if(b != max && b != min){
			mid = b;
		}else{
			mid = c;
		}

		System.out.println("The Integers You Picked " + a + " " + b + " and " + c + " Becomes: " + "\nMin = " + min + "\nMid = " + mid + "\nMax = " + max);

	}
}
