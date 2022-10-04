//(Perfect number) A positive integer is called a perfect number if it is equal to
//the sum of all of its positive divisors, excluding itself. For example, 6 is the first
//perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
//+ 1. There are four perfect numbers less than 10,000. Write a program to find all
//these four numbers.
public class fiveThirtyThree {
    public static void main(String[] args) {
        System.out.println("The four perfect number less than 10,000:");
        int sum;
        for(int number = 1; number < 10000; number++){
            sum = 0;
            for(int divisor = 1; divisor < number;divisor++) {

                if (number % divisor == 0) {
                    sum += divisor;

                }
            }
                if (number == sum) {
                        System.out.printf("\n%d", number);

                }



        }
		System.out.println();
    }
}
