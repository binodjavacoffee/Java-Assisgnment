package assignment_day_15;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// Factorial of Given Number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = input.nextInt();
		
		int fact = 1;
		for (int i = n; i>0 ; i--) {
			fact = fact *i;
			System.out.println(" Factorial Number of " +n + " is " + fact);
		}
		
		input.close();

	}

}
