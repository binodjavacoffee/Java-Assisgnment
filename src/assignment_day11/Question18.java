package assignment_day11;

import java.util.Scanner;

public class Question18 {

	public static void findLargestNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter 1st number:");
		int num1 = input.nextInt();
		System.out.println(" Enter 2nd number:");
		int num2 = input.nextInt(); 
		System.out.println(" Enter 3rd number:");
		int num3 = input.nextInt();
		
		if ((num1>num2) && (num1>num3)) {
		System.out.println( num1 + " is the largest number.");
	}
	else if ((num2>num3) && (num2>num1)){
		System.out.println( num2 + " is the largest number.");
	}
	else if ((num3>num2) &&(num3>num1)){
		System.out.println( num3 + " is the largest number.");
	}
	else {
		System.out.println("All are equal or not equal.");
	}
	input.close();
	}
	public static void main(String[] args) {
		findLargestNumber();
		
	}
}

