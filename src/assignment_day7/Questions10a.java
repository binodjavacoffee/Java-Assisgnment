package assignment_day7;

import java.util.Scanner;

public class Questions10a {

	public static void main(String[] args) {
		// value of s by using input 
		System.out.println("What is the result of s = ut + 1/2 att?");
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the value of u:");
		int u = input.nextInt();
		System.out.println("Enter the value of t: ");
		int t = input.nextInt();
		System.out.println("Enter the value of a: ");
		int a = input.nextInt();
		//now the formula
		int s = (int) (u*t + 0.5*a*t*t) ;
		System.out.println("s= " + s);
		input.close();
		
	}

}
