class AsciiValue

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
		char e='A';
		char b='a';
		char c='?';
		
		System.out.print((int)e); //"print" is a method belongs to "out" object and out belongs to "System" calss.
		System.out.print((int)b);
		System.out.print((int)c);
		
		System.out.print((char)65);
		System.out.print((char)97);
		System.out.print((char)63);
	
	}	
}
