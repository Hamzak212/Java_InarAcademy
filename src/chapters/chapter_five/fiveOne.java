import java.sql.SQLOutput;
import java.util.Scanner;
public class fiveOne {
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number(reset=0):  ");
        int answer = input.nextInt();
        int count = 0, positive = 0, negative = 0, total = 0, average = 0;

        while(answer != 0){
            if(answer > 0){
                positive++;
            }else if(answer < 0){
                negative++;
            }

            total += answer;
            count++;
            answer = input.nextInt();
        }
        System.out.println("Total Positives: " + positive);
        System.out.println("Total Negative: " + negative);
        System.out.println("Total Added: " + total);
        System.out.println("Average: " + total/count);
    }
}
