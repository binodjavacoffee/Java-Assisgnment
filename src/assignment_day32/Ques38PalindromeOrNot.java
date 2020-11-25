package assignment_day32;

import java.util.Scanner;

public class Ques38PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the string:");
		String str = scan.nextLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equals(rev)) {
			System.out.println("This is Palindrome String.");
		} else {
			System.out.println("This is not a Palindrome String.");
		}
		scan.close();

	}

}
