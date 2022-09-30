import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Word To Check Palindrome ");
        String s = input.nextLine();

        //string starts at 0
        int start = 0;
        //ends at length -1
        int end = s.length()-1;

        boolean palindrome = true;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                palindrome = false;
                break;
            }else{
                start++;
                end--;
            }
        }
        System.out.println("Palindrome Status For '" + s + "' : " + palindrome);
    }
}

