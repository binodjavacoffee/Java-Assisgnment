package assignment_day32;

import java.util.Scanner;

public class Question40 {
//Write a program to reverse the string
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String name;");
		String name = input.nextLine();
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		System.out.println("Reverse order of the String :" + name + " is " + rev);
		input.close();
	}

}
