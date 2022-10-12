//(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
//the following header: public static void printMatrix(int n)
//Each element is 0 or 1, which is generated randomly. Write a test program that
//prompts the user to enter n and displays an n-by-n matrix. Here is a sample run:
import java.util.Scanner;
public class Exercise_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\tn-by-n matrix\n");
        System.out.print("Enter n: ");
        int n = input.nextInt();
	System.out.println();
        printMatrix(n);
	System.out.println();
    }
    public static void printMatrix(int n){
        for(int rows = 1; rows <= n; rows++){
            for(int i = 1; i <= n; i++){
                System.out.print((int)(Math.random()*2) + "  ");
            }
            System.out.println();
        }
    }
}

