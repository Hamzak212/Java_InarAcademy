/*(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a twodigit
number. The two digits in the number are distinct. (Hint: Generate the first
digit. Use a loop to continuously generate the second digit until it is different
from the first digit.) */
import java.util.Scanner;
public class fiveThirtyTwo {
    public static void main(String[] args) {
        int random1,random2;
        random1 = (int)(Math.random()*10);

        do{random2 = (int)(Math.random()*10);}while(random1 == random2);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Lottery Guess : ");
        int guess = input.nextInt();
        System.out.println("The Lottery Number Is: " + random1 + random2 + " !");

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        if(guessDigit1 == random1 && guessDigit2 == random2){
            System.out.println("Exact Match! You win $10,000!");
        }else if(guessDigit1 == random2 && guessDigit2 == random1){
            System.out.println("Mixed Match! You win $3,000!");
        }else if(random2 == guessDigit2 || random2 == guessDigit1 || random1 == guessDigit1 || random1 == guessDigit2){
            System.out.println("One Digit Match! You win $1,000!");
        }else{
            System.out.println("You Lose! Try Again Next Time!");
        }
        System.out.println();

    }
}

