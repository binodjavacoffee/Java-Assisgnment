package assignment_day_19;

public class Question35a {

	public static void main(String[] args) {
		// second largest number in an array
		int[] a = { 2, 6, 12, 20, 1, 25, 36, 451, 202, 111 };
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
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
		
	System.out.println("\nSecond Largest Number is : "+ a[1]);
	}
}