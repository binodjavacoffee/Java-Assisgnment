package assignment_day4;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
	
		//Multiplication of Three Numbers
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int n1 = input.nextInt();
		System.out.println("Enter 2nd Number:");
		int n2 = input.nextInt();
		System.out.println("Enter 3rd Number:");
		int n3 = input.nextInt();
		int multiply = n1*n2*n3;
		System.out.println("------------------------------------------------------");
		
		System.out.println("Multiplication of 3 numbers is equal to : " + multiply);
		
		input.close();
		
	
	
	
	
	}

}
