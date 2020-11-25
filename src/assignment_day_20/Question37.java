package assignment_day_20;

public class Question37 {
// 2d array sum
	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] num1 = { { 4, 5, 6 }, { 2, 7, 8 }, { 3, 1, 9 } };

		int[][] sum = new int[3][3];
		System.out.println("The sum of 2 array are:");
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				sum[i][j] = num[i][j] + num1[i][j];
				System.out.print(sum[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}

  
