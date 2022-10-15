/** (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 in which all sides are of the same length and all angles have the same degree (i.e.,
 the polygon is both equilateral and equiangular). The formula for computing the
 area of a regular polygon is Write a method that returns the area of a regular polygon using the following header:
 public static double area(int n, double side)
 Write a main method that prompts the user to enter the number of sides and the
 side of a regular polygon and displays its area. Here is a sample run: */
import java.util.Scanner;
public class Exercise_06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Of Sides: ");
        int n = input.nextInt();
        System.out.print("\nEnter Side Length: ");
        double side = input.nextDouble();

        System.out.println("\nArea: " + area(n, side));
        System.out.println();
    }
    public static double area(int n, double s){
        return (n * (s * s))/(4 * Math.tan(3.141592/n));
    }
}

