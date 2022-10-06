import java.util.Scanner;
public class methodPractice {
    public static int minimum(int min1,int min2){
        int result;
        if(min1 < min2){
            result = min1;
        }else{
            result = min2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers!");
        int min1 = input.nextInt(), min2 = input.nextInt();
        System.out.println("Minimum of Numbers: " + minimum(min1,min2));
    }
}
