
public class Add {

	public static void main(String[] args) {
		int num1=6;
		int num2=3;
		num2=5;
		
		//float num3=6.4; this will give error as in Java by default all the real numbers (Decimal numbers) are of double type.
		//float num4=3.3;
		
		double num3=6.4;
		double num4=3.3;
		
		float num5=6.4f;
		float num6=3.3f;
		System.out.print("INT Additon:");
		System.out.print(num1+num2); //"print" is a method belongs to "out" object and out belongs to "System" calss.
		System.out.println("\n");
		System.out.print("Double Additon:");
		System.out.print(num3+num4);
		System.out.println("\n");
		System.out.print("Float Additon:");
		System.out.print(num5+num6);

	}

}
