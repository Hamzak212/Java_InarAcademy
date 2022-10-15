/** (Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times
 and display the number of winning games. */
public class Exercise_06_32 {
    public static void main(String[] args) {
        int total = 0;
        int point = 0;
        int win = 0;
        int loss = 0;
        for (int count = 1; count <= 1000; count++) {
            System.out.println("Game " + count);
            for (int i = 0; i <= total; i++) {
                int rollOne = (int) (1 + Math.random() * 6);
                int rollTwo = (int) (1 + Math.random() * 6);
                System.out.println("You Rolled: " + rollOne + " + " + rollTwo);


                if (point == added(rollOne, rollTwo)) {
                    System.out.println("Point is: " + point + "\nYOU WIN");
                    win++;
                    break;
                } else if (i != 0) {
                    System.out.println("Point is " + added(rollOne, rollTwo));
                    total++;
                }
                if ((craps(added(rollOne, rollTwo))) && (i == 0)) {
                    System.out.println("Craps! You Lose.");
                    loss++;
                    break;
                }
                if ((natural(added(rollOne, rollTwo))) && (i == 0)) {
                    System.out.println("Natural! You win!");
                    win++;
                    break;
                }
                if ((point(added(rollOne, rollTwo))) && (i == 0)) {
                    System.out.println("Point is " + added(rollOne, rollTwo));
                    point += added(rollOne, rollTwo);
                    total++;
                }

                if (((added(rollOne, rollTwo)) == 7) && i != 0) {
                    System.out.println("You lose!");
                    loss++;
                    break;
                }
                if (((added(rollOne, rollTwo)) == point) && i != 0) {
                    System.out.println("You Win!");
                    win++;
                    break;
                }

            }
            System.out.println();
        }
        System.out.println("Win Count: " + win);
        System.out.println("Loss Count: " + loss);
    }

    public static int added(int rollOne, int rollTwo){
        return rollOne + rollTwo;
    }
    public static boolean craps(int added){
        if(added == 2 || added == 3 || added == 12){
            return true;
        }
        return false;
    }
    public static boolean natural(int added){
        if(added == 7 || added == 11) {
            return true;
        }
        return false;
    }
    public static boolean point(int added){
        if((added >= 4 && added < 7) || (added > 7 && added <= 10)){
            return true;
        }
        return false;
    }
}

