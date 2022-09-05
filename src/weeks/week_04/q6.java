import java.util.Scanner;
public class q6 {
	public static void main(String[] args) {

		int a = (int)(Math.random()*10); 
		int b = (int)(Math.random()*10); 
		int c = (int)(Math.random()*10); 

		Scanner input = new Scanner(System.in);
		System.out.println("What is " + a + " + " + b + " + " + c + " =  ?");


		int answer = input.nextInt();

		if(answer == a + b + c){
			System.out.println("true");
		}else{
			System.out.println("False");
		}
	}
}
