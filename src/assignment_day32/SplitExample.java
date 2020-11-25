package assignment_day32;

import java.util.Scanner;

public class SplitExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string name:");
		String name = input.nextLine();

		String[] words = name.split(" ");
		System.out.println(words.length);
		for (String w : words) {
			System.out.println(w);
		}
		input.close();
	}
}