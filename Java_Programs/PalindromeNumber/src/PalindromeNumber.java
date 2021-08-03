import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n,r,s=0,t;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value to check the Number is Palindrome or not:");
		n=sc.nextInt();
		
		t=n;
		
		/*
		 * n(Actual)	r(reminder)		s(Reverse number)
		 * 1221			1					1
		 * 122			2					12
		 * 12			2					122
		 * 1			1					1221
		 * 0 (out of the loop)
		 */
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=(s*10)+r;
		}
		
		System.out.println("The Value of s is: "+s);
		
		if(s==t) {
			System.out.println(s + " is a Palindrome");
		}
		
		else {
			System.out.println(s + " is not a Palindrome");
		}
		

	}

}
