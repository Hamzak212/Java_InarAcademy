/** (Occurrences of a specified character) Write a method that finds the number of
 occurrences of a specified character in a string using the following header:
 public static int count(String str, char a)
 For example, count("Welcome", 'e') returns 2. Write a test program that
 prompts the user to enter a string followed by a character and displays the number
 of occurrences of the character in the string.*/
import java.util.Scanner;
public class Exercise_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = input.nextLine();
        System.out.print("Enter Character: ");
        char ch = input.next().charAt(0);

        System.out.println("The number of occurrences of '" + ch + "' in \"" + s + "\" is " + count(s,ch) + "!");
        System.out.println();
    }
    public static int count(String s, char ch){
        int count = 0 ;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}

