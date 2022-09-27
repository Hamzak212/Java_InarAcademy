import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        if (n1 < n2) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }



        for(int gcd = n2; gcd <= n1 && gcd <= n2; gcd-- ){

            if(n1 % gcd == 0 && n2 % gcd == 0){
                System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
                System.exit(1);
            }else{
                gcd--;
            }
        }
    }
}
