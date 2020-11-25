package assignment_day4;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	
		//Additions of 3 numbers
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st Number :");
		int a = input.nextInt();
		System.out.println("Enter 2nd Number :");
		int b = input.nextInt();
		System.out.println("Enter 3rd Number :");
		int c = input.nextInt();
		int sum = a+b+c;
		
		System.out.println("Addition of 3 Numbers" + ":" + " a + b + c " + " = " + sum);
		System.out.println("Sum of 3 numbers: " + a + " and " + b  + " and " + c +" is equal " + sum );
		input.close();
		
	}

}
