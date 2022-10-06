
public class primeNumberMethod {
    public static void main(String[] args) {
        System.out.println("First Fifty Prime Numbers: \n");
        printPrimeOf(50);
    }
    public static void printPrimeOf(int totalPrime) {
        int count = 0;
        int number = 2;
        final int TOTAL_PRIME_PER_LINE = 10;
            while(count < totalPrime) {
                if (isPrime(number)) {
                    count++;

                    if (count % TOTAL_PRIME_PER_LINE == 0) {
                        System.out.printf("%-5s\n", number);
                    }
                    else
                        System.out.printf("%-5s", number);
                }
                number++;
            }
    }

    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number / 2; divisor++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
