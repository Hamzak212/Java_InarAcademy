/** (Sort students) Write a program that prompts the user to enter the number of students,
    the students’ names, and their scores, and prints student names in decreasing order of their scores */
import java.util.*;
public class Exercise_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount of Students: ");
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];

        // Prompt the user to enter each students' names and thier scores
        System.out.println("Enter the name and score for each student:");
        for(int i = 0; i < students.length; i++){
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }

        sortDecreasing(students, scores);

        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.printf("\n | %S  -  %d | ", students[i] ,scores[i]);
        }
        System.out.println();
    }
    public static void sortDecreasing(String[] students, int[] scores){

        for(int i = 0; i < scores.length; i++){
            int max = scores[i];
            int maxIndex = i;
            String temp;
            for(int j = i + 1; j < scores.length; j++){
                if(scores[j] > max){
                    max = scores[j];
                    maxIndex = j;
                }
            }
            if(maxIndex != i){
                temp = students[i];
                students[i] = students[maxIndex];
                students[maxIndex] = temp;

                scores[maxIndex] = scores[i];
                scores[i] = max;
            }
        }

    }
}

