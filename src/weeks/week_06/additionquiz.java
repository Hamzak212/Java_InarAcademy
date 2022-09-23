import java.util.Scanner;
public class additionquiz {
    public static void main(String[] args) {
        //total questions we ask
        final int TOTAL_QUESTIONS = 5;
        int count = 0;
        int correct_count = 0;
        int wrong_count = 0;
        Scanner input = new Scanner(System.in);
        long start_time = System.currentTimeMillis();

        while(TOTAL_QUESTIONS != count){
            int number1 = (int)(5 + Math.random()*51);
            int number2 = (int)(5 + Math.random()*51);

            if (number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.println("What is " + number1 + " + " + number2 + " = ?");
            int answer = input.nextInt();

            if(answer == number1 + number2){
                System.out.println("YOU ARE GENIOUS 🤓 ");
                correct_count++;
            }else{
                System.out.println("YOU ARE IDIOT ☹️ \n The Correct Answer is: " + (number1 + number2));
                wrong_count++;
            }

            count++;


        }

        long end_time = System.currentTimeMillis();
        int total_time = (int) Math.abs(start_time - end_time);

        System.out.println("\nYou got " + correct_count + " Questions Correct \nYou got " + wrong_count + " Questions Wrong");
        System.out.println("TOTAL TIME: " + total_time/1000 + " Seconds!");
    }
}
