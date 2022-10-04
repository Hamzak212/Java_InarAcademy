//(Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that plays the scissor-rock-paper game.
// Revise the program to let the user continuously play until either the user or the computer wins more
// than two times than its opponent.
import java.util.Scanner;
public class fiveThirtyFour {
    public static void main(String[] args) {

        int computerPoint = 0;
        int userPoint = 0;
        int tiePoint = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2): ");


        int i;
        for (i = 1; Math.abs(userPoint - computerPoint) < 3; i++) {
            int userPlay = input.nextInt();
            int computerPlay = (int) (Math.random() * 3);

            if (userPlay == 0 && computerPlay == 0 || userPlay == 1 && computerPlay == 1
                    || userPlay == 2 && computerPlay == 2) {
                System.out.println("Tie! You Both Picked " + userPlay);
                tiePoint++;
            } else if (userPlay == 1 && computerPlay == 0 || userPlay == 2 && computerPlay == 1
                    || userPlay == 0 && computerPlay == 2) {
                System.out.println("You win! The Computer Picked " + computerPlay);
                userPoint++;
            } else if (userPlay == 0 && computerPlay == 1 || userPlay == 1 && computerPlay == 2
                    || userPlay == 2 && computerPlay == 0) {
                System.out.println("You Lose. The Computer Picked " + computerPlay);
                computerPoint++;
            } else {
                System.out.println("Your Input Is Incorrect!");
            }

        }
        System.out.println("________________________________________________");
        if (userPoint > computerPoint) {
            System.out.println("Game Over! YOU WIN!");
        } else {
            System.out.println("Game Over! YOU LOSE!");
        }
        System.out.println("Total Plays: " + i + "\nUser Score: " + userPoint + "\nComputer Score: " + computerPoint
        + "\nTie Plays: " + tiePoint);
        System.out.println();
    }
}

