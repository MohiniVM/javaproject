package loop;

public class number {

	public static void main(String[] args) {
		for(int i=1; i<=8; i++)
		{
			System.out.println("");
			for(int j=8; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i; k++)
			{
				System.out.print(k+" ");
			}
			
		}
	}

}
