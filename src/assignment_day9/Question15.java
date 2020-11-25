package assignment_day9;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// ASCII Code
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 127:");
		int n = input.nextInt();
		if (n>=0 && n <=128) {
			char c= (char)n ;
			System.out.println("Correspondents ASCII code is " + c);
		}
		else {
			System.out.println("U entered the wrong numbers.");
		}
	input.close();	
	}

}
