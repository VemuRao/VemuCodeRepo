
public class ThreeDArray {

	public static void main(String[] args) {
		int a[] = new int[4];
		int b[][] = new int[4][4]; // 2-D
		int c[][][] = new int[4][4][4]; // 3-D

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {

					c[i][j][k] = i + j + k;

				}

			}

		}

		System.out.println("======3-D Array||Enhanced For Loop======");

		for (int i[][] : c) {
			for (int j[] : i) {
				for (int k : j)
					System.out.print(k + " ");
			}
		}

	}

}
