package assignment_day8;

import java.util.Scanner;

public class Question13n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		System.out.println();
		if (n > 0)System.out.println();//This won't show anything
		else if (n < 0)System.out.println("This number is Negative.");
		sc.close();
	}
	}


