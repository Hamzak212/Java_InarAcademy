import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number For a Table: ");
        int k = input.nextInt();


        //Header
        System.out.println("          Multiplication Table");

        System.out.print("    ");

        //Top 1-9 Range
        for(int j = 1; j <= k; j++) {
            System.out.print("   " + j);
        }

        //border
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------");




        //left border + table
        for(int i = 1; i <= k; i++){
            System.out.printf("%4d | ", i);
            for(int j = 1; j<=k; j++){
                System.out.printf("%4d", i * j);
            }
            System.out.println();

        }



    }
}


