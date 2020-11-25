package asssignment_day14;

import java.util.Scanner;

public class Question23 {
	// sum 1 to nth natural numbers
	
	
	
	public static void main(String[] args) {
	int n , sum=0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your Number:");
	n= scanner.nextInt();
	for (int i=1; i<=n; i++) {
	
		
		
		sum= sum + i;
	}	
	System.out.println("Sum is: " + sum );	
		scanner.close();
	}

}
