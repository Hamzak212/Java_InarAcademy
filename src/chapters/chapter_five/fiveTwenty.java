//Display all the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
//Per line. Numbers are separated by exactly one space.

public class fiveTwenty {
    public static void main(String[] args) {
        final int TOTAL_PER_LINE = 8;
        int count = 0;


        for(int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
                if (isPrime) {
                    count++;

                    if (count % TOTAL_PER_LINE == 0) {
                        System.out.println(number);
                    } else
                        System.out.printf("%d ",number);
                }


        }
    }
}

