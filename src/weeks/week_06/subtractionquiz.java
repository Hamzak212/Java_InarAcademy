import java.util.Scanner;


public class subtractionquiz {
    public static void main(String[] args) {
        //total questions is 5
        final int NUMBER_OF_QUESTIONS = 5;
        //++ to add correct count
        int correctcount = 0;
        //++ to add wrong count
        int wrongcount = 0;
        //++ to add question count
        int questioncount = 0;
        //to track start time - end time (total time)
        long starttime = System.currentTimeMillis();
        //idk
        String output = " ";
        //ganna ask a question
        Scanner input = new Scanner(System.in);

        while(questioncount < NUMBER_OF_QUESTIONS){
            int number1 = (int)(Math.random()*100);
            int number2 = (int)(Math.random()*100);

            if(number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.println("What is " + number1 + " - " + number2 + " ?");

            int answer = input.nextInt();

            if(answer == number1 - number2){
                System.out.println("You Are Genious 🤓 ");
                correctcount++;
            }else{
                System.out.println("You Are Wrong ☹️ \nThe Answer Should Be -> " + number1 + " - " + number2 + " = " + (number1 - number2));
                wrongcount++;
            }
            questioncount++;

        }
        long endtime = System.currentTimeMillis();
        long totaltime = ((starttime - endtime) / 1000);

        System.out.println("Correct Count Is " + correctcount + "\nWrong Count is " + wrongcount);
        System.out.println("Total Test Time Is " + (Math.abs(totaltime)) + " seconds");
        System.out.println("TOTAL SCORE: " + ((NUMBER_OF_QUESTIONS/correctcount) * 100));
    }
}
