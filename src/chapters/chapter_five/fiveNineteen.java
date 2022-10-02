public class fiveNineteen {
    public static void main(String[] args) {
        int startRight = 0,    // Initialize decending numbers
                endSpace = 7;        // Initialize number of white space in row

        for (int row = 1; row <= 128; row += row) {
            for (int whiteSpace = 0; whiteSpace < endSpace; whiteSpace++) {
                System.out.print("    ");
            }

            for (int triangle1 = 1; triangle1 <= row; triangle1 *= 2) {
                System.out.printf("%4d", triangle1);
            }

            for(int triangle2 = startRight ; triangle2 > 0; triangle2 /= 2) {
                System.out.printf("%4d", triangle2);
            }

            System.out.println();
            endSpace--;
            startRight = row;
        }


    }
}

