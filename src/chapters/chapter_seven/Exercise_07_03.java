/** (Count occurrence of numbers) Write a program that reads the integers between 1
 and 100 and counts the occurrences of each. Assume the input ends with 0. */
import java.util.Scanner;
public class Exercise_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        //put the numbers in the array with value 100
        int[] values = new int[100];
        int data;
        int count = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        do {
            data = input.nextInt();
            values[count] = data;
            count += 1;
        } while (data != 0);

        countOccurrence(values);
    }
    public static void countOccurrence(int[] values){
        for(int i = 1; i <= 100; i++){
            int count = 0;
            for(int j = 0; j < values.length; j++){
                if(values[j] == i){
                    count++;
                }
            }
            if(count != 0){
                System.out.printf("%d occurs %d %s%n", i, count, count > 1 ? "times" : "time");
            }
        }
    }

}

