package assignment_day_15;

import java.util.Scanner;

public class QuestionNo25 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of students:");
	int noOfStudents = input.nextInt();
	int maxScore=0;
	String studentName = "";
	
	for (int i = 1; i<=noOfStudents; i++) {
		System.out.println("Enter the name of the student:");
		String name =input.next();
		System.out.println("Enter the score:");
		int score = input.nextInt();
		
		if(score>maxScore) {
			maxScore = score;
			studentName = name;
		
		}
	}
		System.out.println("Name of the student:" + studentName);
		System.out.println("High Score is :" + maxScore);
		input.close();
	}
	
	
	

}
