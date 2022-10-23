//A pentagonal number is defined as n(3n–1)/2 for
//n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
//Write a method with the following header that returns a pentagonal number:

public class Exercise_06_01 {
    public static void main(String[] args) {
        System.out.println("The First 50 Pentagonal Numbers Are: ");
        for (int n = 1; n <= 100; n++){
            System.out.printf("%7d", getPentagonalNumber(n));

            if (n % 10 == 0) {
                System.out.println(getPentagonalNumber(n));
            }
        }
    }
    public static int getPentagonalNumber(int n) {

            return (n * (3 * n - 1)) / 2;
        }
    }


