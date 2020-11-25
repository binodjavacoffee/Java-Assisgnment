package asssignment_day14;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// Reverse Number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int originalNumber= input.nextInt();//123
		
		int reverseNumber=0;// this is local variable
		
		System.out.println("Orignal Number is : " + originalNumber);
		while(originalNumber!=0) {
			int temp = originalNumber % 10;
			reverseNumber = reverseNumber * 10 + temp;
			originalNumber= originalNumber/ 10;
			
		}
		System.out.println("Reversed number is : "+ reverseNumber);
		input.close();
		
		
	}

}
