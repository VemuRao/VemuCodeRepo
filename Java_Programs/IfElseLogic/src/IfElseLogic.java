
public class IfElseLogic {

	public static void main(String[] args) {
		int num1=5;
		
		if (num1%2==0)
		{
			System.out.println("num1 is Even");
		}
		else {
			System.out.println("num1 is Odd");
		}
		
		int a,b,c;
		a=5;
		b=3;
		c=13;
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest number");
		}
		else if(b>c)
		{
			System.out.println("b is greatest number");
		}
		else
		{
			System.out.println("c is greatest number");
		}

	}

}
