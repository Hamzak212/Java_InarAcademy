/**
 * Chapter 7 Exercise 25:
 *
 *      (Algebra: solve quadratic equations)
 *      Write a method for solving a quadratic equation using the following header:
 *
 *              public static int solveQuadratic(double[] eqn, double[] roots)
 *
 *      The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the
 *      array eqn and the real roots are stored in roots. The method returns the number
 *      of real roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
 *      Write a program that prompts the user to enter values for a, b, and c and displays
 *      the number of real roots and all real roots.
 */
import java.util.*;
public class Exercise_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] eqn = new double[3];
        double[] roots = new double[3];

        System.out.print("Enter a, b, c: ");
        for(int i = 0; i < eqn.length; i++){
            eqn[i] = input.nextDouble();
        }

        //solve the formula with EQN coefficients
        int rootNumber = solveQuadratic(eqn, roots);

        if(rootNumber == 0){
            System.out.println("No real Roots");
        }else{
            printRoots(rootNumber, roots);
        }
    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = (Math.pow(b,2) - (4 * a * c));

        if(discriminant > 0){
            roots[0] = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            roots[1] = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            return 2;
        }else if(discriminant == 0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void printRoots(int rootNumber, double[] roots){
        for(int i = 0; i < rootNumber; i++){
            System.out.println("Root " + (i + 1) + " = " + roots[i]);
        }
    }
}

