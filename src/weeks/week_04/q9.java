import java.util.Scanner;
public class q9 {
	public static void main(String[] args){
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		Scanner input = new Scanner(System.in);
		System.out.println("What is " + a + " + " + b + "?");
		int guess = input.nextInt();
		int answer = a + b;
		if(answer == guess){
		System.out.println("WOW!! You Are Correct!");
		}else{
		System.out.println("WOW!! You Are Dumb!");
	}
	}
}
