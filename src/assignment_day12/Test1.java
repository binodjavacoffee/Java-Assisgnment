package assignment_day12;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//sayHello(;) 
		// this will not work because of not mentioning from which
		// class we are taking the method to main method.
		// we need to add the class name . Here's Example 
		
		//1. this is one way
		//Demo1.sayHello();
		//Demo1.sayHi();
		//Demo1.greet();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice:");
		String choice = sc.next();
		
		switch (choice) {
		case "hello":
			Demo1.sayHello();
			break;
		
		case "hi":
			Demo1.sayHi();
			break;

		case "greet":
			Demo1.greet();
			break;
		default:
			System.out.println("Wrong choice.");
			break;
		}
		sc.close();
	
	}

}
