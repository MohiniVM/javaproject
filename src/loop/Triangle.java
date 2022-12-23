package loop;

public class Triangle {

	public static void main(String[] args) {
		for(int i=0; i<=6; i++)
		{
			System.out.println("");
			for(int j=1;j<=i; j++)
			{
				System.out.print(" ");
		   }
			
			for(int k=6; k>=i; k--)
			{	
				System.out.print(" *");
			}
		}
		for(int k=0;k<=6; k++)
		{
			System.out.println("");
			for(int m=5; m>=k; m--)
			{
				System.out.print(" ");
			}
			for(int n=0; n<=k; n++)
			{
				System.out.print(" *");
			}
		}
	}

}
