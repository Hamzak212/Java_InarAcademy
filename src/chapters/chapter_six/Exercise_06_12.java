/**(Display characters) Write a method that prints characters using the following
//header: public static void printChars(char ch1, char ch2, int numberPerLine)
//This method prints the characters between ch1 and ch2 with the specified numbers per line.
Write a test program that prints ten characters per line from 1 to Z. Characters are separated by exactly one space. */
public class Exercise_06_12 {
    /**
     * Main Method
     */
    public static void main(String[] args) {
        final int PER_LINE = 10;
        char ch1 = '1';
        char ch2 = 'Z';
        System.out.println("-\t-\t- CHARACTER LIST -\t-\t-");
        printChar(ch1, ch2, PER_LINE);
	System.out.println();
    }
    public static void printChar(char ch1, char ch2, int PER_LINE){
        for(char i = ch1, count = 0; i <= ch2; i++, count++){
            if(count % PER_LINE == 0){
                System.out.printf("\n\t   %c ", i);
            }else{
                System.out.print(i + " ");
            }
        }
    }
}

