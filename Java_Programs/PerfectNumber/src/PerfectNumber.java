import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to know whether it is a Perfect Number or not:");
		n=sc.nextInt();
		
		for(int i=1;i<=(n/2);i++) {
			if(n%i==0)
			sum=sum+i;
			}
		System.out.println("The Value of sum is: "+sum);
		
		if(sum==n)
			System.out.println(n+" is a Perfect number");
		else 
			System.out.println(n+" is not a Perfect number");
		

	}

}
