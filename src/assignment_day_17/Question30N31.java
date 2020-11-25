package assignment_day_17;

import java.util.Scanner;

public class Question30N31 {
	
	
	public void fibonacci() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find  fibonacci: ");
		int n = input.nextInt();
		
		int first = 1;
		int second=1; 
		//int n = 5;
		System.out.print(first + " ");
		for (int i = 0; i<=n; i++) {
		System.out.print(second + " ");	
		System.out.println();
		int temp = first + second;
		first = second;
		second= temp;
			
		}
	}
	public void patterns() {
		int n = 5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
	
				
			}
		}
		
		
		
	}
		
		
	
	


