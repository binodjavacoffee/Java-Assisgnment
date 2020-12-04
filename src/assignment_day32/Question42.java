package assignment_day32;

import java.util.Scanner;

public class Question42 {
//find the duplicate words from a lond string
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the long string:");
		String string = input.nextLine();
		int count;
		string=string.toLowerCase();
		String words[]=string.split(" ");
	
		for (int i = 0; i < words.length; i++) {
			count=1;
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
				
			}
			if (count>1 && words[i]!="0")
				System.out.println(words[i]);
			input.close();
		}
	}

}
