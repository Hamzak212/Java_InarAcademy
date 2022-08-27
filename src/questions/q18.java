import java.util.Scanner;
public class q18 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter Salary: ");

double salary = input.nextDouble();


System.out.println("Enter Years of Service: ");

double service = input.nextDouble();


        if (service > 5) {
        System.out.println("Congrats! Your bonus is now " + ((salary / 100) * 5));
}
        else {
        System.out.println("You do not get a raise. Sorry!");
}
}
}

