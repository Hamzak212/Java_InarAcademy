/*
(Sum series) Write a method to compute the following series:
	m(i) = 1 / 2 + 2 / 3 + ... + i / (i + 1)
Write a test program that displays the following table:
i       m(i)
--------------
1        0.5000
2        1.1667
...
19       16.4023
20       17.3546
*/
public class Exercise_06_13 {
    /*** Main Method */
    public static void main(String[] args) {
        double startAmount = 1;
        final double numberOfRows = 20;
        System.out.println("\n    i           m(i)     ");
        System.out.println("------------------------");
        for(double i = 1; i <= numberOfRows; i++){
            System.out.printf("%6.1f", i);
            System.out.printf("%14.3f\n", sumSeries(i));
        }
        System.out.println();
    }
    public static double sumSeries(double n){
        double sum = 0;
        for(double i = 1; i <= n; i++){
            sum += i / (i + 1);
        }
        return sum;
    }
}
