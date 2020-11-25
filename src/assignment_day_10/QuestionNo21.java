package assignment_day_10;

import java.util.Scanner;

public class QuestionNo21 {

	public static void main(String[] args) {
		// Using switch case printing week 
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter choice between 1-7:");
		int choice = input.nextInt();
		
	switch (choice) {
	
	case 1:
		System.out.println(" This is sunday.");
		break;
	
	case 2:
		System.out.println("This is monday.");
		break;
	
	case 3:
		System.out.println("This is Tuesday");
		break;
	
	case 4:
		System.out.println("This is wednesday.");
		break;
	
	case 5:
		System.out.println("This is Thursday.");
		break;
	
	case 6:
		System.out.println("This is friday.");
		break;
	
	case 7:
		System.out.println("This is saturday.");
		break;
	
	default:
		System.out.println("This is wrong day.");
		break;
	
	}
	System.out.println(" more more more more more code:");
	System.out.println(" more code more code.....");
	System.out.println(" Exit.");
	input.close();
	}

}
