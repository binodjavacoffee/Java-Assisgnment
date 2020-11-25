package assignment_day9;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		//if(a>b)&& (a>c)
		//if (b>c)&&(b>a)
		Scanner input= new Scanner(System.in);
		System.out.println("Enter number a :");
		int a = input.nextInt();
		System.out.println("Enter number b :");
		int b = input.nextInt();
		System.out.println("Enter number c :");
		int c = input.nextInt();
		
		if (a > b && a > c){
			System.out.println(" a is the largest number.");
		}else if (b> c && b > a){
		System.out.println("b is the largest number.");
		}else if (c >a && c> b){
		System.out.println("c is the largest number.");
		}else 
			System.out.println("None of the elements are true.");
		
	input.close();
}

}

