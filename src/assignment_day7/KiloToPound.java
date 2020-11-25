package assignment_day7;

import java.util.Scanner;

public class KiloToPound {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of kilogram");
		double kilos= input.nextDouble();
		double pounds= kilos * 2.2046;
		System.out.println(kilos +" Kilogram to pound is " + pounds);
input.close(); 	
	}

}
