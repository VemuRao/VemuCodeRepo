
public class Arrays {

	public static void main(String[] args) {
		
		int a[]=new int[5];//here array is not a variable its a object so we used new keyword to initialize the object. 
		//Values:	1 2 3 4 5
		//indexes:	0 1 2 3 4
		
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
		
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
