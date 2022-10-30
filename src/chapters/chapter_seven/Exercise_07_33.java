/** (Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store
 the animal names */
import java.util.*;
public class Exercise_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
                "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.print("Enter Birth Year => ");

        int year = input.nextInt();

        System.out.println(zodiac[year % 12]);
    }
}

