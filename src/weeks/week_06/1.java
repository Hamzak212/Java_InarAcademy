import java.util.Scanner;
public class 1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Guess A Number 1-10!");

		int tries = 0;
		int guess = -1;
		int number = (int)(Math.random()*10);

			
				while(guess != number){
				System.out.println("Guess A Number! :");
				guess = input.nextInt();

				if(guess == number){
				System.out.println("Your Guess Is Correct! \nTotal Tries: " + tries + " 🤩");
				}else if(guess > number){
					System.out.println("Your Guess Is Too High ☹️");
					tries++;
				}else{
					System.out.println("Your Guess Is Too Low 😁");
					tries++;
				}
			}

		}
	}
