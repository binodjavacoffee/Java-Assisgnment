package asssignment_day14;

import java.util.Scanner;

public class Question22 {
	
	public static void printTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
	
		System.out.println("Print Table : " + n );
		
		for (int i= 1; i<=10; i++) {
		int t = n * i;
		System.out.println(n+ "X" + i + "=" + t);
		
	}
		sc.close();
		}
		
	public static void main(String[] args) {
		
		
		Question22.printTable();
			}
}
	
	
	

