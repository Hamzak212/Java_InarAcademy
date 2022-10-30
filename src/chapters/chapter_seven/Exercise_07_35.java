/*********************************************************************************
 * (Game: hangman) Write a hangman game that randomly generates a word and        *
 * prompts the user to guess one letter at a time, as shown in the sample run.    *
 * Each letter in the word is displayed as an asterisk. When the user makes a     *
 * correct guess, the actual letter is then displayed. When the user finishes a   *
 * word, display the number of misses and ask the user whether to continue to     *
 * play with another word. Declare an array to store words, as follows:           *
 *********************************************************************************/
import java.util.*;
public class Exercise_07_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String play;
        do{
            char[] word = getWord();
            char[] asterisks = new char[word.length];
            fillAsterisks(asterisks);

            int wrongCount = 0;
            do{
                char guess = getGuess(asterisks);

                if(!isCorrectGuess(word, asterisks, guess)){
                    wrongCount++;
                }

            }while(!isWordFinished(asterisks));

            print(word, wrongCount);

            System.out.println("Do you want to guess another word? Enter y or n>");
            play = input.next();

        }while(play.charAt(0) == 'y');

    }
    public static char[] getWord(){
        String[] words = {"write", "that", "chicken", "boy", "broccoli", "chocolateMilk"};
        String pick = words[(int)(Math.random()* words.length)];
        char[] word = new char[pick.length()];
        for(int i = 0; i < pick.length(); i++){
            word[i] = pick.charAt(i);
        }
        return word;
    }
    public static void fillAsterisks(char[] x){
        for(int i = 0; i < x.length; i++){
            x[i] = '*';
        }
    }
    public static char getGuess(char[] asterisks){
        Scanner input = new Scanner(System.in);
        System.out.print("\n(Guess) Enter a letter in word " + Arrays.toString(asterisks) + " > ");
        String g = input.next();
        return g.charAt(0);
    }
    public static boolean isCorrectGuess(char[] word, char[] blanks, char guess){
        boolean isCorrect = false;
        int message = 2;
        for(int i = 0; i < word.length; i++){
            if(word[i] == guess){
                isCorrect = true;
                if(blanks[i] == guess){
                    message = 1;
                }else{
                    blanks[i] = guess;
                    message = 0;
                }
            }
        }
        if(message > 0)
            print(message, guess);
        return isCorrect;
    }
    public static boolean isWordFinished(char[] asterisks){
        for(int i = 0; i < asterisks.length; i++){
            if(asterisks[i] == '*')
                return false;
        }
        return true;
    }
    public static void print(char[] word, int missed) {
        System.out.print("The word is ");
        System.out.print(word);
        System.out.println(" You missed " + missed + " time");
    }

    /** print overloaded */
    public static void print(int m, char guess) {
        System.out.print("\t" + guess);
        switch (m) {
            case 1 : System.out.println(" is already in the word"); break;
            case 2 : System.out.println(" is not in the word");
        }
    }
}

