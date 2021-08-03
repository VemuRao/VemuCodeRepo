class Add

//Java says everything should be in calss
//class name should be same as the file it is a standard approach (it can be differen also)
{
	public static void main(String a[]) 
	//main () method is a default method in java, 
	//here it takes an argument as String a[] (array), 
	//it returns null value so 'void', 
	//methods are 2 types static (belongs to class) & non-static (belongs to object), 
	//access from every where so we added "public"
	{	
		int num1=6;
		int num2=3;
		num2=5;
		
		//float num3=6.4; this will give error as in Java by default all the real numbers (Decimal numbers) are of double type.
		//float num4=3.3;
		
		double num3=6.4;
		double num4=3.3;
		
		float num5=6.4f;
		float num6=3.3f;
		
		System.out.print(num1+num2); //"print" is a method belongs to "out" object and out belongs to "System" calss.
		System.out.print(num3+num4);
		System.out.print(num5+num6);
	
	}	
}
