package assignment_day_19;

public class Array1Demo {

	public static void main(String[] args) {
		final int R = 3;
		final int C = 3;
		int[][] a = new int[R][C];
		a[0][0] = 20;
		a[0][1] = 30;
		a[0][2] = 40;
		
		a[1][0] = 40;
		a[1][1] = 30;
		a[1][2] = 20;
		
		a[2][0] = 220;
		a[2][1] = 200;
		a[2][2] = 201;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
