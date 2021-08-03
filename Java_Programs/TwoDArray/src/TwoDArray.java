

public class TwoDArray {

	public static void main(String[] args) {

		// int x[]=new int[4]; //Object creation initialization and then assignment.

		// Static assignment of array

		int x[] = { 1, 2, 3, 4 };
		int y[] = { 5, 6, 7, 8 };
		int z[] = { 9, 8, 7, 6 };

		int q[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 8, 7, 6 }, };// 2-D Array initialization and assignment.

		System.out.println("======2-D Array======");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(q[i][j] + " ");

			}
			System.out.println("");
		}
		
		System.out.println("======2-D Array||Enhanced For Loop======");
		
		for(int i[]:q) {
			
			for(int j:i) {
				
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
		
		

	}

}
