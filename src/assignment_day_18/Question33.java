package assignment_day_18;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// numbers in descending order in an array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = input.nextInt();
		int[] a = new int[size];
		int temp = 0;
		System.out.println("Enter " + size + " elements number:");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("\n Array Elements are:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
		}

		System.out.println("\n Ascending order for given number are : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);

		}
		input.close();
	}
}
