/** (Game: craps) Craps is a popular dice game played in casinos. Write a program
 to play a variation of the game, as follows:
 Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win. */
public class Exercise_06_30 {
    public static void main(String[] args) {
        int total = 0;
        int point = 0;
        for(int i = 0; i <= total; i++){
            int rollOne = (int) (1+ Math.random()*6);
            int rollTwo = (int) (1+ Math.random()*6);
            System.out.println("You Rolled: " + rollOne + " + " + rollTwo);


            if(point == added(rollOne, rollTwo)){
                System.out.println("Point is: " + point + "\nYOU WIN");
                break;
            }else if(i != 0){
                System.out.println("Point is " + added(rollOne, rollTwo));
                total++;
            }
            if((craps(added(rollOne, rollTwo))) && (i == 0)){
                System.out.println("Craps! You Lose.");
                break;
            }
            if((natural(added(rollOne, rollTwo))) && (i == 0)){
                System.out.println("Natural! You win!");
                break;
            }
            if((point(added(rollOne, rollTwo))) && (i == 0)){
                System.out.println("Point is " + added(rollOne, rollTwo));
                point += added(rollOne, rollTwo);
                total++;
                }

            if(((added(rollOne, rollTwo)) == 7) && i != 0){
                System.out.println("You lose!");
                break;
            }
            if(((added(rollOne, rollTwo)) == point) && i != 0) {
                System.out.println("You Win!");
                break;
            }

        }
        System.out.println();
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

