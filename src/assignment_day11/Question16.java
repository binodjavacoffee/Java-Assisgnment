package assignment_day11;

import java.util.Scanner;

//using method
public class Question16 {
	
	public static void findEvenOrOdd() {
	
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the number to check even or odd:");
		int n = input.nextInt();
		
		if ( n % 2 ==0) {
			System.out.println( n + " is an even number.");
		}
		else {
			System.out.println( n + " is an odd number.");	
			}
	input.close();	
	}		
		
		
	public static void main(String[] args) {
		
		findEvenOrOdd();
		
	
	
	}

	}


