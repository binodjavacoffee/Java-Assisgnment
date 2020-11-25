package assignment_day_15;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int firstNum = input.nextInt();//456
		
		int sum =0;
		int multi =1;
		
		System.out.println("First Number is : "+ firstNum);
		while(firstNum!=0) {
			int temp = firstNum % 10;// 
			sum= sum + temp;
			multi = multi * temp;
			firstNum = firstNum/10;
			
		}
	
	System.out.println("Sum of digits is: " + sum);
	System.out.println("Multiplication of digits is: "+ multi);
	input.close();
	
	}
	

}
