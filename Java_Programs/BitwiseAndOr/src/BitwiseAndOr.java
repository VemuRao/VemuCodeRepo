
public class BitwiseAndOr {

	public static void main(String[] args) {
		//Bitwise AND --> &
		//1 & 1 -->1 else 0
		
		//Bitwise OR --> |
		//0 | 0 -->0 else 1
		
		int a=25; //11001
		int b=15; //01111
		
		int c=a&b; //00001
		int d=a|b; //11111
		
		System.out.println("a & b: " +c+ "\n"+"a |b: "+d);

	}

}
