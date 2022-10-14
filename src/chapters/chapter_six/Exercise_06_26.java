/**(Palindromic prime) A palindromic prime is a prime number and also palindromic. For example,
 * 131 is a prime and also a palindromic prime, as are 313 and
 757. Write a program that displays the first 100 palindromic prime numbers.
 Display 10 numbers per line, separated by exactly one space, as follows:
 2 3 5 7 11 101 131 151 181 191 313 353 373 383 727 757 787 797 919 929 ... */
public class Exercise_06_26 {
    public static void main(String[] args) {
        System.out.println("-\t-\t100 Palindromic Prime Numbers\t-\t-");


        int count = 0;
        for (int i = 0; count < 100; i++) {
            if(isPalindrome(i) && isPrime(i)){
                System.out.printf("%10d", i);
                count++;
                if (count % 10 == 0){
                    System.out.println();
                }
            }
        }

    }

    public static boolean isPrime(int i) {
        if (i < 2) return false;
    for (int divisor = 2; divisor <= i / 2; divisor++) {
        if (i % divisor == 0)
            return false;


    }
    return true;


    }
    public static long reverse(int num){
        long reverse = 0;
        while(num != 0){
            reverse *= 10;
            reverse += (num % 10);
            num /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int num){
        return(num == reverse(num));
    }
}

