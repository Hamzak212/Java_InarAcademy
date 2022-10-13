/** (Convert milliseconds to hours, minutes, and seconds) Write a method that converts milliseconds to hours, minutes, and seconds using the following header:
 public static String convertMillis(long millis)
 The method returns a string as hours:minutes:seconds. For example,
 convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
 a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10. */
import java.util.Scanner;
public class Exercise_06_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Milliseconds: ");
        long milli = input.nextLong();
        System.out.println("hours:minutes:seconds: " + convertMillis(milli));
    }

    public static String convertMillis(Long milli) {
        milli /= 1000;

        String minuteSecond = "";
        for (int i = 0; i < 2; i++) {
            minuteSecond = ":" + milli % 60 + minuteSecond;
            milli /= 60;
        }
        return milli + minuteSecond;
    }
}
