package assignment_day7;

import java.util.Scanner;

public class PerimeterOfTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a");
		double a = input.nextDouble();
		System.out.println("Enter b");
		double b = input.nextDouble();
		System.out.println("Enter c");
		double c = input.nextDouble();
		double perimeterOfTriangle= a+b+c;
		System.out.println("Perimeter of Triangle: " + perimeterOfTriangle);
		input.close();
	}

}
