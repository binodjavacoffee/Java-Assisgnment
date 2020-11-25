package assignment_day_15;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// Program to reverse the given number
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int originalNumber = input.nextInt();
		
		//int originalNumber=456;
		
		int reverseNumber=0;
		System.out.println("Original Number :" + originalNumber);
		
		while (originalNumber !=0) {
			
			int temp = originalNumber % 10 ; // temp is a variable- 6 next 5 next 4
			reverseNumber = reverseNumber * 10 + temp;//6 next 65 next 654
			originalNumber= originalNumber/10;// 45 next 4 next 0
			
			
			
		}
		System.out.println("Reversed Number is : "+ reverseNumber);
		input.close();
	}

}
