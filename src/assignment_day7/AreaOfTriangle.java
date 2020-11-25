package assignment_day7;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length:");
		double l = input.nextDouble();
		System.out.println("Enter breadth");
		double b = input.nextDouble();
		double areaOfTriangle = (l * b) / 2;
		System.out.println("Area of Triangle: " + areaOfTriangle);
		input.close();
	}

}
