package assignment_day8;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// print the number input by the user only if its negative
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number a :");
		int a = input.nextInt();
		if (a > 0)System.out.println("The number is postive : " +a );
		else if (a < 0)System.out.println("The number is negative : "+ a); 
			
		input.close();
	}

}
