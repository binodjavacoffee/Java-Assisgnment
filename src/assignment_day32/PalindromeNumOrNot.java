package assignment_day32;

import java.util.Scanner;

public class PalindromeNumOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = input.nextInt();
		int temp = num;
		int rev = 0;
		int rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if (num == rev) {
			System.out.println(num + " This is Palindrome Number.");
		} else {
			System.out.println(num + " This is not Palindrome Number.");
		input.close();
		}
		
	}
}
