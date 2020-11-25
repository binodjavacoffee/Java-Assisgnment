package assignment_day9;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the three sides of the triangle a b c ");
		int sideA= input.nextInt();
		int sideB= input.nextInt();
		int sideC= input.nextInt();
	//there is 	three triangle 
		
		if ((sideA==sideB) && (sideA==sideC)) {
			System.out.println(" This is equilateral triangle.");
		}
		else if ((sideA==sideB) ||(sideA==sideC)|| (sideB==sideC)) {       
		System.out.println("This isoceles triangle.");
		}else
			System.out.println("This is scalene triangle.");
		
	input.close();	
	}

}
