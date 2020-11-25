package assignment_day7;

import java.util.Scanner;

public class PoundToKilo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of pounds");
		double pounds= input.nextDouble();
		double kilos= pounds * 0.454;
		System.out.println("Pound To Kilograms is " + kilos);
 	
		
		
		
		input.close();
	}

}
