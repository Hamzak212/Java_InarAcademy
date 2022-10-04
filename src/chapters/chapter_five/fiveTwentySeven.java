//Write a program that displays all the leap years, ten per line, from 101 to 2100,
//separated by exactly one space. Also display the number of leap years in this period.
public class fiveTwentySeven {
    public static void main(String[] args) {
        final int TOTAL_PER_LINE = 10;
        int count = 0;

        for(int year = 101; year <= 2100; year++) {

           boolean leapYear;

            leapYear = year % 4 == 0;

            if(leapYear){
                if(count % TOTAL_PER_LINE == 0) {
                    System.out.printf("\n%d ",year);
                }else {
                    System.out.printf(" %d ", year);
                }
                count++;
            }

        }
        System.out.print("\nTOTAL NUMBER OF LEAP YEARS: " + count);
        System.out.println("\n-----------------------------------");
    }
}


