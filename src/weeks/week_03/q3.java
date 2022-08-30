/*A 3 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895
*/

import java.util.Scanner;

public class q3 {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");

        int number = input.nextInt();


        int a = number / 1000;
        int remainingamount = number % 1000;
        int b = remainingamount / 100;
        int remainingamount1 = remainingamount % 100;
        int c = remainingamount1 / 10;
        int remainingamountt = remainingamount1 % 10;
        int d = remainingamountt;

        System.out.println(number + " backwards is " + d + c + b + a);
        }
}

