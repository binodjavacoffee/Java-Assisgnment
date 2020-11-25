package assignment_day9;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// IfDemo
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number a:");
		int a =input.nextInt();
		if (a < 0 ) { // if this is true this shows result otherwise goes to next line 
			System.out.println("This is negative number");
		}
		System.out.println("more code remain");
		System.out.println("exit");
		input.close();
	}
	
	}


