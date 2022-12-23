package loop;

public class pyramid {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
         System.out.println("");
        for(int k=4; k>=i; k-- ) 
        {
        	System.out.print(" ");
        }
         for(int j=1; j<=i; j++)
         {
        	 System.out.print(" *");
         }
       }
	for(int m=1; m<=5; m++)	
	{
		System.out.println("");
		for(int n=1; n<=m; n++)
		{
			System.out.print(" ");
		}
		for(int o=4; o>=m; o--)
		{ 
			System.out.print(" *");
 		}
	}
		
		
	}
}

