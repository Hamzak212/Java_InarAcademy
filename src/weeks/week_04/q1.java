import java.util.Scanner;
public class q1 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Lottery Guess:  ");

	int lottery = (int)(Math.random() * 100);
	int guess = input.nextInt();

	int lottery1 = lottery / 10;
	int lottery2 = lottery % 10;

	int guess1 = guess / 10;
	int guess2 = guess % 10;

	if(lottery == guess){
		System.out.println("Exact Match! You win $10,000! \nYour guess: " + guess + "\nLottery Number: " + lottery);
	}else if((lottery1 == guess1) || (lottery2 == guess1) || (lottery1 == guess2) || (lottery2 == guess2)){
		System.out.println("Match One Digits! You win $1,000! \nYour guess: " + guess + "\nLottery Number: " + lottery);
	}else if((lottery1 == guess2) && (lottery2 == guess1)){
		System.out.println("Match Both Digits! You win $3,000! \nYour guess: " + guess + "\nLottery Number: " + lottery);
	}else{
		System.out.println("YOU LOSE!" + "\nYour Guess: " + guess + "\nLottery Number: " + lottery);
	}

	}

}

