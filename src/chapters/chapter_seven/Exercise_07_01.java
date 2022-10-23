/**
(Assign grades) Write a program that reads student scores, gets the best score,
and then assigns grades based on the following scheme:
Grade is A if score is >= best - 10;
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all the scores, and concludes by displaying the grades. */

import java.util.Scanner;

public class Exercise_07_01 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the total number of students
        System.out.print("Enter the number of students: ");
        int[] score = new int[input.nextInt()];
        char[] grade = new char[score.length];

        //get score from input
        System.out.print("\nEnter " + score.length + " scores: ");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
        }

        getGrade(score, grade);

        for(int i = 0; i < score.length; i++){
            System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade[i]);
        }

    }
        public static int max (int[] array){
            int max = array[0];
            for(int i = 1; i < array.length; i++){
                if(array[i] > max){
                    max = array[i];
                }
            }
            return max;
        }

        public static void getGrade(int[] score, char[] grade){
            int best = max(score);
            for(int i = 0; i < score.length; i++){
                if(score[i] >= best - 10) {
                    grade[i] = 'A';
                }else if(score[i] >= best - 20){
                    grade[i] = 'B';
                }else if(score[i] >= best - 30) {
                    grade[i] = 'C';
                }else if(score[i] >= best - 40) {
                    grade[i] = 'D';
                }else {
                    grade[i] = 'F';
                }
            }
        }

}
