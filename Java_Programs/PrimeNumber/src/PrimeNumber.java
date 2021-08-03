import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime Number: The number which is divided by itself or 1.
		//E.g. 3 5
		
		int n=0;
		boolean b= isPrimeNumber(n);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a valid number to know whether it is a Prime Number or not:");
		n=sc.nextInt();
				
		if(b)
			System.out.println(n+ " is a Prime number");
		else 
			System.out.println(n+ " is not a Prime number");
	}
		
	public static boolean isPrimeNumber(int n) 
	{
		
		for (int i=2;i<n;i++) {
			
			if(n%i==0) 
				return false;
			break;
				}
		return true;
	}
		
			

	

}
