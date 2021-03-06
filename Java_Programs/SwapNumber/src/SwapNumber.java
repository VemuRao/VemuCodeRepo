
public class SwapNumber {

	public static void main(String[] args) {
		//Swap using temp variable
		//it consumes 4 bit extra memory
		int a=5,b=4,temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
		
		//Swap using sum and minus operation, this also consumes extra memory during sum and minus operation.
		
		int i=5; //--101
		int j=4; //--100
		
		i=i+j; //a=9 -->1001 --> 4bits
		j=i-j;
		i=i-j;
		
		System.out.println("===================================");
		System.out.println("The value of i is: "+i);
		System.out.println("The value of j is: "+j);
		
		//Swap using XOR operator (^)
		//This approach will not consume any extra memory.
		
		int m=5; //--101
		int n=4; //--100
		
		//XOR: if( 1 1-->0|| 0 0-->0) else 1
		
		m=m^n;// 1 0 1 ^ 1 0 0 ==>0 0 1
		n=m^n;// 0 0 1 ^ 1 0 0 ==>1 0 1 ==>5
		m=m^n;// 0 0 1 ^ 1 0 1 ==>1 0 0 ==>4
		
		System.out.println("===================================");
		System.out.println("The value of m is: "+m);
		System.out.println("The value of n is: "+n);
		
		//Swap using Arithmatic operation (new way)
		//This approach will not consume any extra memory.
		
		int o=5;
		int p=4;
		
		p= o+p-(o=p);// here first we are evaluating the bracket part whre we assinged p value to o ==>4 and then we substracted the 4 from (o+p)-4.
		
		System.out.println("===================================");
		System.out.println("The value of o is: "+o);
		System.out.println("The value of p is: "+p);

	}

}
