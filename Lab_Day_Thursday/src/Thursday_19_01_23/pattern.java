package Thursday_19_01_23;

public class pattern {

	public static void main(String[] args) {
		/*
		     **********
*			  ********
			   ******
*				****
				 **
				 *
		 */
		int n = 8; 
		for(int r=1; r<=n; r++)
		{
			for(int c=n; c>=r; c--)
			{
				System.out.print("*");
				System.out.print(" ");
				
			}
			System.out.println();
			for(int c=1; c<=r; c++)
			{
				System.out.print(" ");
			}
			
		}
		
		
		
	}

}
