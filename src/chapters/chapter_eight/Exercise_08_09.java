/** (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
 marking an available cell in a 3 * 3 grid with their respective tokens (either
 X or O). When one player has placed three tokens in a horizontal, vertical, or
 diagonal row on the grid, the game is over and that player has won. A draw (no
 winner) occurs when all the cells on the grid have been filled with tokens and
 neither player has achieved a win. Create a program for playing tic-tac-toe.
 The program prompts two players to enter an X token and O token alternately. Whenever a token is entered,
 the program redisplays the board on the
 console and determines the status of the game (win, draw, or continue).*/
import java.util.*;
public class Exercise_08_09 {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        displayBoard(board);

        while(true){
            makeAMove(board, 'X');
            displayBoard(board);

            if(isWon(board, 'X')) {
                System.out.println("Player X Won!");
                System.exit(1);
            }
            if(isDraw(board, 'X')){
                System.out.println("Draw Game, no winner.");
                System.exit(2);
            }

            makeAMove(board, 'O');
            displayBoard(board);

            if(isWon(board, 'O')){
                System.out.println("Player O Won!");
                System.exit(1);
            }else if(isDraw(board, 'O')){
                System.out.println("Draw Game, no winner.");
                System.exit(2);
            }
        }
    }
    public static void displayBoard(char[][] board){

        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++)
                System.out.print(board[i][j] != '\u0000' ?  board[i][j] + " | ": "  | ");
            System.out.println("\n-------------");
        }
    }
    public static void makeAMove(char[][] board, char player){
        Scanner input = new Scanner(System.in);
        boolean done = false;
        do{
            System.out.print("Enter a row (0, 1, or 2) for player" + player + ": ");
            int row = input.nextInt();
            System.out.print("\nEnter a column (0, 1, or 2) for player" + player + ": ");
            int column = input.nextInt();

            if(board[row][column] == '\u0000'){
                board[row][column] = player;
                done = true;
            }else{
                System.out.println("This cell is already occupied, try again...");
            }

        }while(!done);
    }
    public static boolean isWon(char[][] board, char play){
        //check row
        for(int i = 0; i < board.length; i++){
            if(board[i][0] == play && board[i][1] == play && board[i][2] == play)
                return true;
        }
        //check column
        for(int j = 0; j < board.length; j++){
            if(board[0][j] == play && board[1][j] == play && board[2][j] == play)
                return true;
        }
        //check diagonal1
        if(board[0][0] == play && board[1][1] == play && board[2][2] == play)
            return true;
        //check diagonal2
        if(board[0][2] == play && board[1][1] == play && board[2][0] == play)
            return true;

        return false;
    }
    public static boolean isDraw(char[][] board, char play){
        for(int row = 0; row < board.length; row++)
            for(int column = 0; column < board.length; column++)
                if(board[row][column] == '\u0000')
                    return false;



        return true;
    }
}
