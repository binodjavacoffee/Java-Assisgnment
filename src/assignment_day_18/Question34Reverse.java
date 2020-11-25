package assignment_day_18;

import java.util.Scanner;

public class Question34Reverse {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = input.nextInt();
		int[] a = new int[size];
		int temp = 0;
		System.out.println("Enter " + size + " elements number:");
		for (int i = 0; i < a.length; i++) {
			a[i]=input.nextInt();
		}
		System.out.println("\n Array Elements are:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+ a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
		
			}
		
			}
			}
		
		System.out.println("\n Descending order for given number are : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] );
		}
	}
	}
	

	


