import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //random number generated for "number"
        int number = (int)(Math.random()* 101);

        //putting scanner to ask questions
        Scanner input = new Scanner(System.in);

        //giving prompt
        System.out.println("Guess a Magic Number 1 - 100!");

        //giving random number for "guess" that is not in the parameters of (guess != number)
        int guess = -1;
        //putting while statement for guess to NOT equal number
        while(guess != number) {
            //asking for input
            System.out.println("\nEnter Your Guess");
            //guess input changes -1 (line 14) to input
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Congrats! You Guessed The Correct Number!");
            } else if (guess > number) {
                System.out.println("Your Guess Is Too Big 😨");
            } else {
                System.out.println("Your Guess Is Too Small 😭");
            }
        }
    }
}