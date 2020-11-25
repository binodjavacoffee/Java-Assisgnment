package assignment_day7;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length:");
		double l= input.nextDouble();
		System.out.println("Enter width:");
		double w = input.nextDouble();
		double perimeterOfRectangle = 2*(l+w);
		System.out.println("Perimeter of Rectangle : " + perimeterOfRectangle);
		input.close();
		
	}

}
