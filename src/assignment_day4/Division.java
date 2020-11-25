package assignment_day4;

import java.util.Scanner;

//Division 2 numbers
public class Division {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 1st Number: ");
			int n1 = input.nextInt();
			System.out.println("Enter 2nd Number: ");
			int n2 = input.nextInt();	
			
			double divide = (double)n1/n2;
			
			System.out.println("------------------------------------------------");
			System.out.println("Division of 2 numbers is equal to : "+ divide);
			input.close();
		}
}