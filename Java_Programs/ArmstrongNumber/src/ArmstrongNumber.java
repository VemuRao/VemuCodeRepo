import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Armstrong Number: if sum up the qube value of each digit of number and if it matches with the actual number then it is an Armstrong Number
		//E.g. 153 ==> 1^3+5^3+3^3 ==> 1+125+27 =153
		
		int n,r,s=0,t;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a valid number to know whether it is an Armstrong Number or not:");
		n=sc.nextInt();
		
		t=n;
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			s=s+(r*r*r);
			
		}
		
		System.out.println("The sum value is: "+s);
		
		if(t==s)
			System.out.println(t+ " is an Armstrong Number!");
		else 
			System.out.println(t+ " is not an Armstrong Number!");
		

	}

}
