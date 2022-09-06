import java.util.Scanner;
public class q11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Guess (1 For Heads or 0 For Tails):  ");
		int guess = input.nextInt();
		int random = (int)(Math.random()*2);

		if(guess == random){
			System.out.println("\nYour Guess: " + guess + "\nResult: " + random + "\n\nYOU WIN!");
		}else{
			System.out.println("\nYour Guess: " + guess + "\nResult: " + random + "\n\nYOU LOSE!");
		}
	}
}
