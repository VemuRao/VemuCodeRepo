
public class PrePostIncrement {

	public static void main(String[] args) {
		int i=5;
		i= i+1; 
				
		int k=5;
		k=++k; //Pre increment: First increment then assignment
		
		int l,m,n,o;
		l=5;
		m=++l;
		
		n=5;
		o=n++;
		
		int j=5;
		j= j++; //Post increment: Assignment first then increment
		
		
		/*int temp;
		temp=j;
		j++;
		j=temp;*/
		
		System.out.println("The value of i is: "+i);
		System.out.println("The value of k is: "+k);
		System.out.println("The value of l is: "+l);
		System.out.println("The value of m is: "+m);
		System.out.println("The value of n is: "+n);
		System.out.println("The value of o is: "+o);
		System.out.println("The value of j is: "+j);
		
				
				
		
		
		

	}

}
