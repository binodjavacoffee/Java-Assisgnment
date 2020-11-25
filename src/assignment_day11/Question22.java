package assignment_day11;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Print Given Table 
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter Table Number:");
		
		int t= input.nextInt();
		System.out.println("Multiplication Table " + t);
		
		for (int i=1 ; i<=10; i++) {
			
			System.out.println(t + " * " + i+ " = " + t * i);
		input.close();
		}
	}

}
