public class TernaryOperator {

	public static void main(String[] args) {
		//Ternary operator ((condition)?(true value):(else false value))
		//Ternary operator is the replace of If Else logic but it will always returns the biggest data type value in case of Object type variables.
		
		int a=1;
		int b=5;
		
//		if(a==1) 
//		{
//			++b;
//			System.out.println("Value of b is: "+b);
//		}
//		else {
//			System.out.println("Value fo b is: "+b);
//		}
		
		//Same above code in Ternary operator
		
		b=(a==1)?++b:b;
		System.out.println("Value fo b is: "+b);
		
		//Ternary operator is the replace of If Else logic but it will always returns the biggest data type value in case of Object type variables.
		
		Object obj1;
		Object obj2;
		
//		if(true) {
//			obj1= new Integer(10);
//			
//		}
//		else {
//			obj1= new Double(15.0);
//		}
		
		//System.out.println("Vlue of obj1: "+obj1);
		
		obj2=true?new Integer(10):new Double(15.0);
		System.out.println("Vlue of obj2: "+obj2);
		
	

	}

}
