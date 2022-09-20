import java.util.Scanner;
public class guessnumber {
	public static void main(String[] args) {

		int number = (int)(Math.random()*101);
		Scanner input = new Scanner(System.in);

		System.out.println("Guess A Number 1-100!");

		int guess = -1;

		while(guess != number){
			System.out.println("Guess A Number! :");
			guess = input.nextInt();
			
			if(guess == number){
				System.out.println("Your Guess Is Correct! 🤩");
			}else if(guess > number){
				System.out.println("Your Guess Is Too High ☹️");
			}else{
				System.out.println("Your Guess Is Too Low 😁");
			}
		}

	}
}
