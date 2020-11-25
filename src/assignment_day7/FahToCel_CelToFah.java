package assignment_day7;
 
import java.util.Scanner;

public class FahToCel_CelToFah {
//Convert Fahrenheit to Celsius
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the degree fahrenheit: ");
		double f = input.nextDouble();
		double cel = (f-32)/1.8;
		System.out.println("Fahrenheit to celsius :" + cel);
		
	//Convert Celsius to Fahrenheit
		System.out.println();
		System.out.println("Enter the degree celsius: ");
		double c = input.nextDouble();
		double fah = (c*1.8)+32;
		System.out.println("Celsius to fahrenhiet of :"+c +" is "+ fah);
		input.close();
	}

}
