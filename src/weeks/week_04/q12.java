//Write a program that displays a random coordinate in a rectangle.
//The rectangle is centered at (0, 0) with width 100 and height 200.

import java.util.Scanner;
public class q12 {
	public static void main(String[] args) {
		int random_width = -50 + (int)(Math.random()*100);
		int random_hight = -100 + (int)(Math.random()*200);

		System.out.println("Your random point is: " + "(" + random_width + ", " + random_hight + ")");

	}
}
