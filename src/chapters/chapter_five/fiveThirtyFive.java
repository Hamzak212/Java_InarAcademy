/* (Summation) Write a program to compute the following summation.
1 / (1 + √2) + 1 / (√2 + √3) + 1 / (√3 + √4) + ... +  1 / (√624 + √625) */

public class fiveThirtyFive {
    public static void main(String[] args) {

        double math = 0;
        for(double i = 1 ; i <= 624.0 ; i++){
            math += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
 	System.out.println();    
  System.out.printf("Result: %.2f\n",math);
    }
}

