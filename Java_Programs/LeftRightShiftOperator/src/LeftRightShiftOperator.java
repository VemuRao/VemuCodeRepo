
public class LeftRightShiftOperator {

	public static void main(String[] args) {
		int a = 25; //11001
		int b= a << 2; //001 (left (<<) shift by 2 bytes)
		int c= a >> 2; //110 (Right (>>) shift by 2 bytes)
		
		System.out.println("Left shift a value is: "+b);
		System.out.println("Right shift a value is: "+c);

	}

}
