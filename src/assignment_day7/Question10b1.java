package assignment_day7;

import java.util.Scanner;

//Mathematical Functions
public class Question10b1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter value a:");
		double a = input.nextDouble();
		System.out.println("Enter value b: ");
		double b = input.nextDouble();	
		System.out.println("Enter value c: ");
		double c = input.nextDouble();
		double s = (a + b + c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area is : " + area);
		input.close();
		
	}
}
