package assignment_day_19;


public class Question35 {

	public static void main(String[] args) {
		// find the second largest number in a given array
		int[] a = { 5, 6, 9, 20, 201, 25, 16, 45, 22, 101 };
		for (int i = 0; i < a.length; i++) {  
			int temp;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];   
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println("Second Largest Number is " + a[1]);

	}

} 