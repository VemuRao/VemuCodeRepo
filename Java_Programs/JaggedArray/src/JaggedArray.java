import java.util.Random;

public class JaggedArray {

	public static void main(String[] args) {

		// Static values assignment to an array.
		int q[][] = { { 1, 2, 3, 4 }, { 5, 6 }, { 9, 8, 7, 6, 8 } };// 2-D Array initialization and assignment.

		System.out.println("======2-D Array||Enhanced For Loop======");

		for (int i[] : q) {

			for (int j : i) {

				System.out.print(j + " ");
			}
			System.out.println("");
		}

		int k[][] = new int[3][];

		// in Jagged Array row size is always same but column size varies.

		k[0] = new int[4];
		k[1] = new int[2];
		k[2] = new int[5];

		Random r = new Random();

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < k[i].length; j++) {

				k[i][j] = r.nextInt(20);
			}

		}

		System.out.println("======2-D Jagged Array (Random Value (20))||Enhanced For Loop======");

		for (int o[] : k) {

			for (int p : o) {

				System.out.print(p + " ");

			}
			System.out.println("");
		}

	}

}
