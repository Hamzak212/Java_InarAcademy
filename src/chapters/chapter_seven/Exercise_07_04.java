/** (Analyze scores) Write a program that reads an unspecified number of scores and
 determines how many scores are above or equal to the average and how many
 scores are below the average. Enter a negative number to signify the end of the
 input. Assume that the maximum number of scores is 100. */


import java.util.Scanner;
public class Exercise_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Scores to Compute Average(exit = 0): ");

        int data;
        int[] scores = new int[100];
        int count = 0;

        do{data = input.nextInt();
            scores[count] = data;
            count++;
        }while(data > 0);

        double average = computeAverage(scores, count);
        System.out.printf("The Average of " + (count - 1) + " scores is %.2f", average);
        System.out.println("\nHigher than average => " + highOccurrence(scores, average));
        System.out.println("Lower then average => " + lowOccurrence(scores, average));
    }
    public static double computeAverage(int[] scores, int count){
        double total = 0;
        for(int i = 0; i < scores.length; i++){
            total = scores[i] + total;
        }

        return total/(count - 1);
    }
    public static int highOccurrence(int[] scores, double average){
        int count = 0;
        for(int i = 0 ; i < scores.length; i++){
            if(scores[i] > average){
                count++;
            }
        }
        return count;
    }
    public static int lowOccurrence(int[] scores, double average){
        int count = 0;
        for(int i = 0 ; i < scores.length; i++){
            if (scores[i] < average && scores[i] != 0) {
                count++;
            }
        }
        return count;
    }
}

