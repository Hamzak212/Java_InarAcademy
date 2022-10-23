(import java.util.Scanner;
public class gcdMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();

        System.out.println("The Greatest Common Divisor For " + num1 + " and " + num2 + " is " + gcd(num1,num2));
    }
    public static int gcd(int num1, int num2){
        int gcd = 1;
        int k = 2;
        while(k <= num1 && k <= num2){
            if(num1 % k == 0 && num2 % k == 0){
                gcd = k;
            }
            k++;
        }
        return gcd;
    }

}
