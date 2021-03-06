public class LabeledUnLabledBreak {

	public static void main(String[] args) {
		
		System.out.println("With out break:");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("* "); // we used System.out.print to print in one line
			}
			System.out.println("");
		}
		
	System.out.println("With Unlabeled break:");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if (i==3)
					break;//Unlabeled break: it will only break inner loop as we have not defined any label
				System.out.print("* "); // we used System.out.print to print in one line
			}
			System.out.println("");
		}
		
	System.out.println("With Labeled break:");
		
	OuterLoop:
		for(int i=1;i<=4;i++)
		{
			InnerLoop:
			for(int j=1;j<=4;j++)
			{
				if (i==3)
					break OuterLoop;//labeled break: it will outer loop as we have defined OutterLoop label
				System.out.print("* "); // we used System.out.print to print in one line
			}
			System.out.println("");
		}
		

	}

}
