import java.util.Random;

public class PrintRandomNumbers {

	public static void main(String[] args) {
		int a[]=new int[20];//here array is not a variable its a object so we used new keyword to initialize the object. 
		//Values:	1 2 3 4 5
		//indexes:	0 1 2 3 4
		
		Random r=new Random();
		
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt(50); //r.nextInt(Boundary value==> 50) so it will print the values from 0 to 50
			
		}

		//below is the normal for loop to fetch the array values.
		//this is useful if we want to select a defined part of an array.
		//if we want to fetch the entire array value then we should use enhanced for loop instead of regular for loop.
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		System.out.println("===Enhanced For Loop===");
		
		for(int j : a)
			System.out.println("The value of j is: "+j);
		


	}

}
