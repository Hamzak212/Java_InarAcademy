/** (Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example, 3 and 5 are twin primes,
 5 and 7 are twin primes, and 11 and 13 are twin primes.
 Write a program to find all twin primes less than 1,000. Display the output as follows:
 (3, 5)
 (5, 7)
 ... */
public class Exercise_06_29 {
    public static void main(String[] args) {
        System.out.println("Prime / Twin Prime Chart");
        for(int i = 3; i <= 1000; i++){
            if(isPrime(i) && isPrime(twin(i))){
                System.out.printf("%1d", i);
                System.out.printf("\t\t\t%d\n", twin(i));
            }
        }
        System.out.println();
    }
    public static boolean isPrime(int i){
        for (int divisor = 2; divisor <= i / 2; divisor++) {
            if (i % divisor == 0) {
                return false;
            }
        }
            return true;
    }
    public static int twin(int i){
        return i + 2;
    }

}




