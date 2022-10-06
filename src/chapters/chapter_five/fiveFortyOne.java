import java.util.Scanner;
public class fiveFortyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int occurrence = 0;
        int number = 1;
        System.out.println("Enter Integers(End With 0)");
        while (number > 0) {
            number = input.nextInt();

            if (number > max) {
                max = number;
                occurrence = 0;
            }
            if (number == max) {
                occurrence++;
            }

        }
        System.out.println("Max Number: " + max + "\nOccurrences of Number: " + occurrence);

    }
}

