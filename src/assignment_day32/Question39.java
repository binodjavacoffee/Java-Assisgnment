package assignment_day32;

import java.util.Scanner;

public class Question39 {
	// write a program to display name in short form
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = input.nextLine();

		name = " " + name;
		int pos = name.lastIndexOf(' ');
		for (int i = 0; i < pos; i++) {
			if (name.charAt(i) == ' ')

				System.out.print(name.charAt(i + 1) + ".");
		}

		System.out.print(name.substring(pos));
		input.close();
	}

}
