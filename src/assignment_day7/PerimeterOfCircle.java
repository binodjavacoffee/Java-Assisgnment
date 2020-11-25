package assignment_day7;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r = input.nextDouble();
		final double PI= Math.PI;
		double perimeterOfCircle = 2*PI*r;// formula
		System.out.println("Perimeter Of Circle : "+ perimeterOfCircle);
		input.close();
	}

}
