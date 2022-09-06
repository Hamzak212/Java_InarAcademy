import java.util.Scanner;
public class q13 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Scissor (0), Rock (1), Paper (2): ");

        int answer = input.nextInt();
        int random = (int)(Math.random()*3);

        if(random == answer){
                System.out.println("YOU WIN! \nYou said: " + answer + "\nAnswer Was: " + random);
        }else{
                System.out.println("You LOSE! \nYou said: " + answer + "\nAnswer Was: " + random);
        }

        }
}

