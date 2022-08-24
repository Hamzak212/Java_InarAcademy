import java.util.Scanner; 

	public class q8 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("We Are Calculating The Formula For Kinetic Energy!");
	
	System.out.print("Enter the Mass: ");
	double mass = input.nextDouble();
	
	System.out.print("Enter Velocity: ");
	double velocity = input.nextDouble();


	double answer = (Math.pow(velocity, 2));

	System.out.println("Kinetic Energy is  " + (mass * 0.5 * answer));
	

}
	}

