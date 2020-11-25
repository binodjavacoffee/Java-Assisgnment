package assignment_day_10;

import java.util.Scanner;

public class QuestionNo20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice + * / -");
		char choice = input.next().charAt(0);
		
		int a= 0 , b= 0, result=0;
		
		if (choice=='+'||choice=='-'||choice=='*'||choice=='/');{
		
		System.out.println("Enter number 1:");
		 a = input.nextInt();
		System.out.println("Enter number 2:");
		 b = input.nextInt();
		}
		
		
		switch(choice) {
		
		
		case'+':
			result = a+b;
			System.out.println("Sum is " + result);
			break;
		
		case'-':
			result = a-b;
			System.out.println("Substraction is " + result);
			break;
		
		case'/':
			result = a/b;
			System.out.println("Division is " + result);
			break;
		
		case'*':
			result = a*b;
			System.out.println("Multiplication is " + result);
			break;
		
		default:
			System.out.println("wrong choice.");
			break;
			
		}
		System.out.println("more more more code...");
		System.out.println("More code...");
		System.out.println("End command line.");
		input.close();
	
	}

}
