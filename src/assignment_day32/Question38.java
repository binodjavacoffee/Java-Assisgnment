package assignment_day32;

import java.util.Scanner;

public class Question38 {
//write a program to check whether a given string is palindrome or not
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string name:");
		String str = input.nextLine();
		String ori_Str = str;
		String rev = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		
		//System.out.println(rev);
		if(ori_Str.equals(rev)) {
			System.out.println(ori_Str+ " is Palindrome String.");
		}else {
				System.out.println(ori_Str + " is not Palindrome String.");
				input.close();
			}
		}
	}


