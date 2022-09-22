import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter minutes");
        int minutes = input.nextInt();
        //375 minutes
        int hours = minutes / 60;
        // 6 hours 
        int remainingminutes = minutes % 60;
        // 15 minutes
        int days = hours / 24 ;
        int remaininghours = hours % 24 ;
        int years = days / 365;
        int remainingdays = days % 365 ;
        System.out.println(minutes + " is " + years + "years" + (days + remainingdays) + "days");
    }

}
