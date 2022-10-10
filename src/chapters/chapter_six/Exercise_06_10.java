//(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
//isPrime(int number) method for testing whether a number is prime. Use this
//method to find the number of prime numbers less than 10000.

public class Exercise_06_10 {
    public static void main(String[] args) {
        System.out.println("\n\t  PRIME CHART 1 - 1000\n");
	//counter
        int count = 0;
        // < 1000 loop
        for (int i = 2; i < 1000; i++) {
            if(isPrime(i)){
                System.out.printf("%4d",i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nTOTAL COUNT: " + count);
    }
    public static boolean isPrime(int number) {

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
            return true;

    }
}
