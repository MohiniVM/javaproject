package loop;

import java.util.Scanner;

public class butterfly {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of rows need to print the pattern");
		
		int rows = scanner.nextInt();
		{
			System.out.println("printing the pattern");
			for(int i= 1; i<=rows; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print("*");
				for(int k=i*2; k<=rows*2-1; k++)	
				{
					System.out.print("");	
					}
				System.out.println();
				}
				for(int l=1; l<=rows-1; l++)
				{
					for(int m=rows-1; m>=l; m--)
					{
						System.out.print("*");
					}
					for(int n=1; n<=l*2; n++)
					{
						System.out.print("");
					}
					for(int o=rows-1; o>=l; o--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				scanner.close();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
}


