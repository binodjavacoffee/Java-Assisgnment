package assignment_day5;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		double p = input.nextDouble();
		System.out.println("Enter the time: ");
		double t = input.nextDouble();
		System.out.println("Enter the rate; ");
		double r = input.nextDouble();
		
		double si = (p*t*r)/100;
		System.out.println("Simple Interest is : " + si);
		
		input.close();
		
	}

}
