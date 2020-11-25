package assignment_day11;

import java.util.Scanner;

public class Question17 {

	public static void findLeapYear() {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the Year:");
		int year = input.nextInt();
		
		if(year %4 ==0) {
			System.out.println(year + " is LEAP YEAR.");
			}
		else {
			System.out.println(year +" is not LEAP YEAR. ");
		}
	input.close();
	}
		public static void main(String[] args) {
				findLeapYear();
				
			
	}

}
