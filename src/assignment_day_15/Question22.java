package assignment_day_15;
import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the table number: ");
		int n = input.nextInt();
		System.out.println("Multiplication Table : "+ n);
		
		for (int i=1; i<=n; i++) {
			System.out.println(n + " X " +i + " = " + n * i);
		
		input.close();
		}
	}

}
