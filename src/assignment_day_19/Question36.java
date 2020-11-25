
package assignment_day_19;

public class Question36 {

	public static void main(String[] args) {
		// Duplicate Elements
		int[] arr = { 2, 6, 2, 4, 6, 20, 45, 85, 25, 45 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					System.out.println("Duplicate Number: "+ arr[j]);
					
				}
				
			}
		}
	}
}