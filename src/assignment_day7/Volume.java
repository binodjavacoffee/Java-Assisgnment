package assignment_day7;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI=Math.PI;
		System.out.println("Enter radius:");
		double r= input.nextDouble();
		System.out.println("Enter height");
		double h = input.nextDouble();
		double volume = PI * r * r *h;
		System.out.println("Volume of cylinder is :" +volume);
		input.close();
	}

}
