import java.util.Scanner;
public class max_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer (the input ends if it is 0): ");
        int number, max;
        number = input.nextInt();
        max = number;

        while(number != 0){
            System.out.println("Enter an integer (the input ends if it is 0): ");
            number = input.nextInt();

            if(number > max){
                max = number;
            }
        }
        System.out.println("Number is " + number + "\nMax is " + max);

    }
}
