package assignment_day32;

import java.util.*;

public class Question43 {

	public static void main(String[] args) {
		// Write a program to trap the exception handling to trap the divided by zero
		// and out 0f index value in array

			int[] a = new int[5];
			Scanner input= new Scanner(System.in);
			System.out.println("Enter array elements:");
			for (int i = 0; i < a.length; i++) {
				a[i]=input.nextInt();// give arrays elements 0
			}
			try {
				for (int i = 0; i < a.length; i++) {
					try {
						int b=a[i]/a[i+1];
						System.out.println(b);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception: "+e);}
			}
			}catch(ArrayIndexOutOfBoundsException ae) {
					ae.printStackTrace();
				}
			input.close();
			}
			}