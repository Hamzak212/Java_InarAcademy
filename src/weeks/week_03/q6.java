import java.util.Scanner;
public class q6 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("enter the int of your choice");
	double bet = input.nextDouble();
	double max =(int)(Math.random()*100);
	
		if((max > 50) && (bet > 50)){
		System.out.println("\nYOU WIN!\nYour CHANCE is:" + max + "\nYour BET is: " + bet);
		}else if((max < 50) && (bet < 50)) {
		System.out.println("\nYOU WIN!\nYour CHANCE is:" + max + "\nYour BET is: " + bet);
		}else{
		System.out.println("\nYOU LOSE\nYour CHANCE is:" + max + "\nYour BET is: " + bet);



}
}
}
