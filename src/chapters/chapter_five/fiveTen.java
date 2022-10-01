//Write a program that displays all the numbers from 100 to 1,000, ten per line,
// that are divisible by 5 and 6. Numbers are separated by exactly one space.
import java.util.Scanner;
public class fiveTen {
    public static void main(String[] args) {
        final int count_per_line = 10;
        int count = 0;

        for(int i = 100;i <= 1000;i++){

            if(i % 5 == 0 || i % 6 == 0){
                count++;
                if(count % count_per_line == 0){
                    System.out.println(i);
                }else {
                    System.out.print(i + " ");
                }

            }

        }
    }
}
