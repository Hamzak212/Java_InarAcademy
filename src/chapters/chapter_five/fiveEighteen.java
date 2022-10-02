import java.util.Scanner;
public class fiveEighteen {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for(int row = 1; row <= 6; row++){
            for(int a = 1; a <= row;a++){
                System.out.print(a + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern B");
        for(int row1 = 6; row1 > 0; row1--){
            for(int b = 1; b <= row1; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }

        System.out.println("Pattern C");
        for(int row2 = 1; row2 <= 6; row2++){
            for(int whiteSpace = 6 - row2; whiteSpace > 0; whiteSpace--){
                System.out.print("  ");
            }

            for(int c = row2; c > 0; c--){
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern D");
        for(int row3 = 1; row3 <= 6; row3++){
            for(int d = 2; d <= row3; d++){
                System.out.print("  ");
            }
            for(int e = 1; e <= 7 - row3; e++){
                System.out.print(e + " ");
            }
            System.out.println();
        }

    }
}

