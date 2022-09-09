import java.util.Scanner;
public class q26 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Offset Time to GMT: ");

		int offset = input.nextInt();

		long milliseconds = System.currentTimeMillis();

		long total_seconds = milliseconds / 1000;
		long seconds = total_seconds % 60;

		long total_minutes = total_seconds / 60;
		long minutes = total_minutes % 60;

		long total_hours = total_minutes / 60;
		long hour = total_hours % 24;
		long hours = hour + offset;




		if(hours >= 10 && minutes >= 10){
			System.out.print("The Time is (" + (hours - 12) + ":" + minutes + ":" + seconds + ")");
		}else if(hours < 10){
			System.out.print("The Time is (0" + (hours - 12) + ":" + minutes + ":" + seconds + ")");
		}else if(minutes < 10){
			System.out.print("The Time is (" + (hours - 12) + ":0" + minutes + ":" + seconds + ")");
		}else if(hours < 10 && minutes < 10){
			System.out.print("The Time is (0" + (hours - 12) + ":0" + minutes + ":" + seconds + ")");
		} 

		if(hour > 12){
			System.out.println("pm");
		}else{
			System.out.println("am");

		}
	}
}
