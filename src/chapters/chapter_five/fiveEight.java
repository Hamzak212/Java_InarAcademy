//Write a program that prompts the user to enter the number of students and each student’s name and score,
// and finally displays the name of the student with the highest score.
import java.util.*;
public class fiveEight {
    public static void main(String[] args) {
        //ask for number of students and assign student_count
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Of Students: ");
        int student_count = input.nextInt();

        int highest_score = 0;
        String highest_score_name = " ";

        System.out.println("Enter Each Students Name and Score: ");
        for(int i = 0; i < student_count; i++){
            System.out.print("Student: " + (i + 1) + "\nName: ");
            String name = input.next();
            System.out.print("Score: ");
            int score = input.nextInt();

            if(score > highest_score){
                highest_score = score;
                highest_score_name = name.toUpperCase();
            }
        }


        System.out.println("The Student With The Highest Score: " + highest_score_name);
        System.out.println("The Score is: " + highest_score);

    }
}

