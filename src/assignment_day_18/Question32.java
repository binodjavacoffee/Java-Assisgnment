package assignment_day_18;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = input.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element:");
			arr[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];

		}
		System.out.println("Sum of the all elements of array is :" + sum);
		input.close();
	}

}
