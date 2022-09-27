import java.util.Scanner;
public class TuitionPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Price Of Your Tuition");
        double tuition = input.nextInt();
        double double_tuition = tuition * 2;

        System.out.println("Enter Percent Change!");
        int percent = input.nextInt();
        int new_percent = percent/100;
        int year = 0;

        while(tuition < double_tuition){
            tuition *= 1.07;
             year++;
            System.out.println(year + " " + tuition);
        }

        System.out.println("\nTuition Will Be Doubled In " + year + " Years!");
        System.out.println("\nTuition Will Be $" + tuition + " In " + year + " Years");
    }
}

