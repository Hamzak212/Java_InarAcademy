//Use a while loop to find the smallest integer n such that n2 is greater than 12,000.
import java.util.Scanner;
public class fiveTwelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base Number: ");
        int base = input.nextInt();
        int n = 1;
        int count = 0;
        while(n > count){
            if(n * n < base){
                n++;
            }else{
                break;
            }
        }
        System.out.println("The Lowest 'n' to 'n^2' For " + base + " is: " + n);


    }
}

