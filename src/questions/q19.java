import java.util.Scanner;
public class q19 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


System.out.println("Enter 3 Numbers: ");

double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();

if ((a > b) && (a > c)) {
	System.out.println( a + " is the biggest"); }
else { 

if ((b > c) && (b > a)) {
        System.out.println( b + " is the biggest"); }
else { 

if ((c > a) && (c > b)) {              
	System.out.println( c + " is the biggest"); }



if ((a < b) && (a < c)) {
        System.out.println( a + " is the lowest"); }
else {

if ((b < c) && (b < a)) {
        System.out.println( b + " is the lowest"); }
else {

if ((c < a) && (c < b)) {
	System.out.println( c + " is the lowest"); }

}
}
}
}
}
}
