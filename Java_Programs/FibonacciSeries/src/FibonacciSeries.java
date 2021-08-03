import java.util.Scanner;

public class FibonacciSeries {

	
	public static void main(String[] args) {
		int k,a,b;
		k=0;
		a=1;
		b=1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a valid number:");
		int n= sc.nextInt();
				
		System.out.print("1 1 ");
		
		while(k<=n) {
			
			k=a+b;
			System.out.print(k + " ");
			a=b;
			b=k;
		}
		System.out.println("");
		System.out.println("Completed!!");
		

	}

}
