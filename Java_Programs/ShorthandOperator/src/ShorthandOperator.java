
public class ShorthandOperator {

	public static void main(String[] args) {
		
		int i=5;
		int j=5;
		i = i+2;
		j += 2;
		
		byte k=5;
		//k=k+2.5; //Type mismatch can not covert double value to byte
		k+=2.5; //However in shorthand it is working because in shorthand operator it always takes the data type of the first variable E1 op E2= E1 type 
		
		System.out.println("The value of i+2 is:" +i);
		System.out.println("The value of j+=2 is:" +j);
		
		System.out.println("The value of k+=2.5 is:" +k);// returns byte type result

	}

}
