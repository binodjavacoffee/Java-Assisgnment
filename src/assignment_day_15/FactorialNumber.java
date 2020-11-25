package assignment_day_15;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int num=input.nextInt();
		int fact=1;
		for (int i=num; i>0; i--) {
			fact = fact * i;
			System.out.println(i);
		}
		
		System.out.println("Factorial is :" + fact);
		input.close();
	}

}
