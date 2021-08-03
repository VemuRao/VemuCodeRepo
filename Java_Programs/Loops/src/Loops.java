
public class Loops {

	public static void main(String[] args) {
		int i=1;
		
		//While loop: always checks for true condition
		System.out.println("While Loop:");
		
		while(i<=10) {
			System.out.println(i);
			i++; //post increment
		}
		
		//do{} while(condition): First evaluates the block and then checks for the condition

		int j=15;
		
		System.out.println("Do While Loop:");
		
		do {
			System.out.println(j);
			j++; //post increment
		} while (j<=10);
		
		//For loop: here we initialize the value, increment and check condition in one row itself.
		
						
		System.out.println("For Loop:");
				
			for(int k=1;k<=10;k++) {
				
				System.out.println(k);
					
			}
	}

}
