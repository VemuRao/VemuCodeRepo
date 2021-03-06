public class PrintPatterns {

	public static void main(String[] args) {
		/*
		 * * * *
		 * * * *
		 * * * *
		 * * * *
		 */
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("* "); // we used System.out.print to print in one line
			}
			System.out.println("");
		}
		
		System.out.println("===============================");
		
		/*
		 * 
		 * * 
		 * * * 
		 * * * *
		 */
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* "); // we used System.out.print to print in one line
			}
			System.out.println("");
		}
		
System.out.println("===============================");
		
		/*
		 * * * *
		 *     *
		 *     *
		 * * * *
		 */
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				
				if(i==1||i==4||j==1||j==4){
				System.out.print("* "); // we used System.out.print to print in one line
				}
				else {
					
					System.out.print("  ");
				}
				
				}
			System.out.println("");
		}
System.out.println("===============================");
		
		/*
		 1 2 3 4
		 1 2 3 4
		 1 2 3 4
		 1 2 3 4
		 */		
	for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
				{
					System.out.print(j+" "); // we used System.out.print to print in one line
				}
			System.out.println("");
		}

System.out.println("===============================");

/*
 1 1 1 1
 2 2 2 2
 3 3 3 3
 4 4 4 4
 */		
	for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
				{
					System.out.print(i+" "); // we used System.out.print to print in one line
				}
			System.out.println("");
		}
	
System.out.println("===============================");

	/*
	 1 2 3 4
	 2 3 4 1
	 3 4 1 2
	 4 1 2 3
	 */		
		for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=4;j++)
					{
						int k=i+j-1;
						
						if(k>4)
						{
						System.out.print(k -4 +" "); // we used System.out.print to print in one line
						}
						else {
							System.out.print(k+ " ");
						}
					}
				System.out.println("");
			}
		System.out.println("===============================");

		/*
		 		j
			i	1 2 3 4 5
			1  	1
			2  	0 1
			3  	1 0 1
			4  	0 1 0 1
			5  	1 0 1 0 1
		 */
		
		for (int i=1;i<=5;i++){

			if(i%2!=0){
			
				for (int j=1;j<=i;j++)
					
					if(j%2!=0){
						System.out.print("1 ");
					}
					else if (j%2==0)
					{
						System.out.print("0 ");
					}
				}

			else {
				for (int j=1;j<=i;j++)
				{
					if(j%2!=0){
						System.out.print("0 ");
					}
					else if (j%2==0)
					{
						System.out.print("1 ");
					}
				}
			}
			System.out.println("");
		}
		
		System.out.println("===============================");
		/*
 		j
	i	1 2 3 4 5
	1  	1
	2  	0 1
	3  	1 0 1
	4  	0 1 0 1
	5  	1 0 1 0 1
 */

		for (int i=1;i<=5;i++){
		
		
				for (int j=1;j<=i;j++) {
					
					if((i+j)%2!=0){
						System.out.print("0 ");
					}
					else if ((i+j)%2==0)
					{
						System.out.print("1 ");
					}
				}
		
			
			System.out.println("");
		}
		
System.out.println("===============================");
		/*
 		j
	i	1 2 3 4 5
	1  	1
	2  	2 2
	3  	3 3 3
	4  	4 4 4 4
	5  	5 5 5 5 5
 */

		for (int i=1;i<=5;i++){
		
		
				for (int j=1;j<=i;j++) {
					
					
						System.out.print(i+" ");
					
				}
		
			
			System.out.println("");
		}
		

	}

}
