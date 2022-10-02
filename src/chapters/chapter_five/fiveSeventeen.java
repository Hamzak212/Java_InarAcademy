// Write a program that prompts the user to enter an integer from
// 1 to 15 and displays a pyramid, as shown in the following sample run:
import java.util.Scanner;
public class fiveSeventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number For Pyramid: ");
        int number = input.nextInt();

        if(number >= 2 && number <= 15){
            for(int row = 1; row <= number; row++){

                for(int whiteSpace = number - row; whiteSpace > 0; whiteSpace--){
                    System.out.print("  ");
                }
                for(int triangle1 = row; triangle1 > 0; triangle1--){
                    System.out.print(triangle1 + " ");
                }
                for(int triangle2 = 2; triangle2 <= row; triangle2++){
                    System.out.print(triangle2 + " ");
                }
                System.out.println();

            }
        }else{
            System.out.println("No Solution: Not In The Range 2 - 15!");
        }
    }
}

