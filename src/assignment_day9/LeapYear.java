package assignment_day9;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Leap Year
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Year :");
		int year = input.nextInt();
		
		if (year%4==0) {
			System.out.println( year + " is the LEAP YEAR.");
		}
		else {
			System.out.println(year + " is not the LEAP YEAR.");
		}
	input.close();
	}
	

}
