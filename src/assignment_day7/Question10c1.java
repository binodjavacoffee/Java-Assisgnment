package assignment_day7;

import java.util.Scanner;

public class Question10c1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value a:");
		double a = input.nextDouble();
		System.out.println("Enter value b: ");
		double b = input.nextDouble();	
		System.out.println("Enter value c: ");
		double c = input.nextDouble();
		double x = (-b+(Math.sqrt(b*b - 4*a*c)))/2*a;
		System.out.println(x);
	input.close();
	}

}
