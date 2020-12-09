package assignment_day_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Question44 {
//write a program to store name and address of 10 students in file and search address by given name
	public static void main(String[] args) {
		HashMap<String, String> Address = new HashMap<String, String>();
		Address.put("binod", "Rosedale NY");
		Address.put("pramod", "Jackson Heights NY");
		Address.put("neerun", "York PA");
		Address.put("dinesh", "Elmhurst NY");
		Address.put("kumar", "Rosedale NY");
		Address.put("bajimaya", "Jackson Heights NY");
		Address.put("thapa", "Elmhurst NY");
		Address.put("gurung", "Pokhara NEpal");
		Address.put("nepal", "Kathmandu");
		Address.put("nepali", "Putalisadak");
		
		String decision="";
		
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.nextLine().toLowerCase();

		if (Address.containsKey(name)) {
			System.out.println(name + " = " + Address.get(name));
			
		} else {
			System.out.println("This is wrong entry.");
			

		}
		System.out.println("Do you want to continue? Enter yes|no");
		decision = sc.next();
		sc.close();
	}while(decision.equalsIgnoreCase("yes"));
	System.out.println(" Bye bye See u later.");
	
	}

}
