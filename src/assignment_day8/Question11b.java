package assignment_day8;

import java.util.Scanner;

public class Question11b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the value of a ");
		int a = input.nextInt();
		System.out.println(" Enter the value of b ");
		int b = input.nextInt();
		System.out.println();
		System.out.println("Before swapping a : " + a);
		System.out.println("Before swapping b : " + b);
		System.out.println();
		a=a+b;//50
		b=a-b;//20
		a=a-b;//30
		System.out.println("After swap value of a : " + a);
		System.out.println("After swap value of b : " + b);
		input.close();
	}
	

}
