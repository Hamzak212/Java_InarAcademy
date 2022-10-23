/**
 * Chapter 7 Exercise 6:
 *
 *      (Revise Listing 5.15, PrimeNumber.java)
 *      Listing 5.15 determines whether a number n is prime by checking
 *      whether 2, 3, 4, 5, 6, ..., n/2 is a divisor. If a divisor is found, n is
 *      not prime. A more efficient approach is to check whether any of the prime
 *      numbers less than or equal to √n can divide n evenly. If not, n is prime.
 *      Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
 *      You need to use an array to store the prime numbers and later use them to check whether
 *      they are possible divisors for n.
 */
public class Exercise_07_06 {
    public static void main(String[] args) {
        //create array with value 50
        int[] primeNumbers = new int[50];
        int count = 0;

        //put prime numbers into array
        for(int i = 2; count < primeNumbers.length; i++){
            if(isPrime(i)){
                primeNumbers[count] = i;
                count++;
            }
        }

        //display array
        displayArray(primeNumbers);

    }
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;

        }
        return true;
    }
    public static void displayArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {

            System.out.printf("%10d ", numbers[i]);
            if ((i + 1) % 10 == 0) System.out.println("");
        }


    }


}
