/** (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 in the form 2p - 1 for some positive integer p. Write a program that finds all
 Mersenne primes with p <= 31 and displays the output as follows:
 p             2^p –1
 -----------------------
 2             3
 3             7
 5             31
 ...
 */
public class Exercise_06_28 {
    public static void main(String[] args) {
        System.out.println("p                  2^p –1");
        System.out.println("- - - - - - - - - - - - - -");
        int count = 0;
        for (int p = 2; count <= 31; p++) {
            if (isPrime(p)) {
                System.out.printf("%1d", p);
                System.out.printf("\t\t\t%d\n",Mersenne(p));

            }
        count++;
    }
        System.out.println();
}

    public static boolean isPrime(int p) {
        for (int divisor = 2; divisor <= p / 2; divisor++) {
            if (p % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static int Mersenne(int p){
        return (int) (Math.pow(2,p) - 1);
    }
}

