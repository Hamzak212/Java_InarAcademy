import java.util.Scanner;

/** (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
 students in increasing order of the number of correct answers. */
public class Exercise_08_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        //      student number   /-/     correct answers
        int[][] correctCounts = new int[answers.length][2];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCounts[i][0] = i;
                    correctCounts[i][1]++;
                }
            }
        }
        //sort
        sort(correctCounts);
        System.out.println("Scores In Ascending Order: ");
        //display
        for(int row = 0; row < correctCounts.length; row++){
            System.out.println("Student " + (correctCounts[row][0] + 1) + "'s correct count is " + correctCounts[row][1]);
        }
    }
    public static void sort(int[][] m){
        for(int i = 0; i < m.length; i++){
            int minCol1 = m[i][1]; //correct count of i Student
            int minCol0 = m[i][0]; //student #
            int minIndex = i;
            for(int j = i + 1; j < m.length; j++){
                if(minCol1 > m[j][1]){ //if value at i (0) > value at j (1) OR 1st number is greater than 2nd number
                    minCol1 = m[j][1]; // first number is equal to second number
                    minCol0 = m[j][0]; // student at i (0) == student at j (1)
                    minIndex = j;      // min index WAS i. since I > J. j is min index
                }
            }

            if(minIndex != i){ // if value at i (0) > value at j (1)
                m[minIndex][1] = m[i][1]; // score at j == score at i
                m[minIndex][0] = m[i][0]; // student # at j == student # at i
                //reset
                // i goes from 0 to 1  - - j goes from 1 (i(0) + 1) to 2 (i(1) + 1)
                m[i][1] = minCol1;
                m[i][0] = minCol0;
            }
        }
    }
}



