package assignment_day11;

import java.util.Scanner;

public class Question20 {
	// Using switch case method
	public static void itsYourChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1st Number:");
		int n1= sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int n2= sc.nextInt();
		System.out.println("Enter your choice:");
		String choice = sc.next();
		int result;
		
		if (choice=="+" ||choice=="-" || choice=="*" || choice=="/") {
			}
		switch (choice ) {
		
		case"+":
			result=n1+n2;
			System.out.println("This is addition: "+n1+n2 + result);
			break;
		
		case"-":
			result=n1-n2;
			System.out.println("This is substraction:" + result);
			break;
		
		case"*":
			result=n1*n2;
			System.out.println("This is multiplication:" + result);
			break;
			
		case"/":
			result=n1/n2;
			System.out.println("This is division:" + result);
			break;

		default:
			System.out.println("This is not in the choice.");
			break;
		}
		sc.close();
	}
			
		public static void main(String[] args) {
			itsYourChoice();
			System.out.println(" more code ... ");
		System.out.println("This is the end of the program.");
		
	}

}
