package loop;

public class Arrow2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++ )
			{
				System.out.print("*");
			}
		  System.out.println("");
		}
	 for(int l=1; l<=5; l++)
	 {
		 for(int n=1; n<=l; n++)
		 {
			 System.out.print(" ");
		 }
		for(int m=5;m>l; m--) 
		{
			System.out.print("*");
		}
		 System.out.println("");
	 }
	
	}
	
	

}
