/**(Generate random characters) Use the methods in RandomCharacter in Listing
 6.10 to print 100 uppercase letters and then 100 single digits, printing ten per line. */

public class Exercise_06_38 {
    public static void main(String[] args) {
        int TOTAL_PER = 100;
        int PER_LINE = 10;
        for(int i = 1; i <= TOTAL_PER; i++) {
            if(i % PER_LINE == 0){
                System.out.println(UpperCase(TOTAL_PER));
            }else {
                System.out.print(UpperCase(TOTAL_PER) + " ");
            }
        }
        for(int i = 1; i <= TOTAL_PER; i++) {
            if(i % PER_LINE == 0){
                System.out.println(LowerCase(TOTAL_PER));
            }else {
                System.out.print(LowerCase(TOTAL_PER) + " ");
            }
        }
        System.out.println();
    }
    public static char UpperCase(int total){
        return (char) ('A' + Math.random() * ('Z' - 'A' + 1));
    }
    public static char LowerCase(int total){
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }
}

