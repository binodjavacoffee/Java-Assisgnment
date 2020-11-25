package assignment_day11;

import java.util.Scanner;

public class Question19 {

	public static void findKindOfTriangle() {
		Scanner sc = new Scanner(System.in);
		double sideA, sideB, sideC;
		System.out.println("Enter sideA");
		sideA = sc.nextDouble();
		System.out.println("Enter sideB");
		sideB = sc.nextDouble();
		System.out.println("Enter sideC");
		sideC = sc.nextDouble();
		
		if ((sideA==sideB) && (sideA==sideC)) {
			System.out.println("This is Equilateral Triangle.");
		}
		else if ((sideA==sideB)||(sideB==sideC)||(sideC==sideA)) {
			System.out.println("This is Isocelse Triangle.");
		}
		else {
			System.out.println("This is Scalene Triangle.");
		}
		sc.close();
	}
		
		public static void main(String[] args) {
			findKindOfTriangle();
			
		}

}
