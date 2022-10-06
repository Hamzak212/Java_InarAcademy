import java.util.Scanner;
public class methodPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Score to Grade -> ");
        int grade = input.nextInt();
        System.out.print("The Grade Is"); grade(grade);
    }
    public static void grade(double grade) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Score to Grade -> ");




            if (grade >= 90) {
                System.out.println(" A");
            } else if (grade >= 80) {
                System.out.println(" B");
            } else if (grade >= 70) {
                System.out.println(" C");
            } else if (grade >= 60) {
                System.out.println(" D");
            } else {
                System.out.println(" F");
            }
        }
    }
}
