package assignment_day8;

import java.util.Scanner;

public class Question12 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = input.nextLine();
			System.out.println("What is your nationality?");
			String nationality = input.nextLine();
			System.out.println("What is your age?");
			int age = input.nextInt();
			System.out.println();
			System.out.println("===================================================");
			System.out.println("Name: "+ name);
			System.out.println("Nationality: " +nationality);
			System.out.println("Age: " + "" + age);
			System.out.println("==================================================");
			input.close();
	}

}
