import java.util.*;
public class fiveThree {
    public static void main(String[] args) {
        System.out.print("Kilograms     Pounds");
        int kilo = 1;
        double pound = 2.2;

        System.out.print("\n-----------------------------");

        
        while(kilo < 100){
            System.out.printf("      \n%d              %.1f", kilo, pound * kilo);

            kilo++;
        }
    }
}
