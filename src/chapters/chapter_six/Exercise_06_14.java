/** (Estimate p) p can be computed using the following series:
    m(i) = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + (((-1)^i + 1) / (2i - 1)))
Write a method that returns m(i) for a given i and write a test program that displays */
public class Exercise_06_14 {
    public static void main(String[] args) {
        final double iStart = 1;
        final double iEnd = 901;
        System.out.println("\ni             m(i)     ");
        System.out.println("---------------------");
        for(double i = iStart; i <= iEnd; i += 100){
            System.out.printf("%4.1f\t\t",i);
            System.out.printf("%.4f\n",estimatePi(i));
        }
    }
    public static double estimatePi(double n){
        double pi = 0;
        for(double i = 1; i<=n; i++ ){
            pi += Math.pow(-1, i +1) / (2 * i - 1);
        }
        pi *=4;
        return pi;
    }
}

