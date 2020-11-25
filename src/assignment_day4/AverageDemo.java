package assignment_day4;

import java.util.Scanner;

public class AverageDemo {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 1st Number: ");
	int n1 = input.nextInt();
	System.out.println("Enter 2nd Number: ");
	int n2 = input.nextInt();
	int average = (n1+n2)/2;
	System.out.println("----------------------------------------------------------");
	System.out.println("First Number= "+n1);
	System.out.println("Second Number= " +n2);
	System.out.println("Average of 2 numbers is equal to : "+ average);
	input.close();
	

	
	}

}
