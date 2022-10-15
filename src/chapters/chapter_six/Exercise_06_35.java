/** (Geometry: area of a pentagon) The area of a pentagon can be computed using the
 following formula:
 Area = 5 * s24 * tan¢ p 5 ≤
 Write a method that returns the area of a pentagon using the following header:
 public static double area(double side)
 Write a main method that prompts the user to enter the side of a pentagon and
 displays its area. Here is a sample run: */
import java.util.Scanner;
public class Exercise_06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Side Of a Pentagon. ");
        double side = input.nextDouble();
        System.out.println("\nArea is " + area(side));
        System.out.println();
    }
    public static double area(double s){
        return (5 * (s * s))/(4 * Math.tan(3.141592/5));
    }
}

