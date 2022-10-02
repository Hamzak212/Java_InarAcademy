//Write a program that prints the characters in the ASCII character table from ! to ~.
// Display ten characters per line. Characters are separated by exactly one space
import java.util.Scanner;
public class fiveFifteen {
    public static void main(String[] args) {
        final int TOTAL_PER_LINE = 10;
        int count = 1;
        for(int i = 33; i <= 126;i++){

            if(count % TOTAL_PER_LINE == 0){
                System.out.println((char)i);
            }else{
                System.out.print((char)i + " ");
            }

            count++;


        }
    }
}

