
public class VarArgs {

	public static void main(String[] args) {
		
		Display.show(5);
		Display.show(5,6);
		

	}
	
	public class Display {
		
		static void show(int ... a) {
			System.out.println("====Inside Show===");	
			for(int i:a)
			
			System.out.println("The Value is : "+ i);
		}
		
		static void show(int a) {
					
			System.out.println("====Inside Show1===");
			System.out.println("The Value of a is : "+ a);
		}
		
	
	}

}
