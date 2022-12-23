package logical_programs;

public class F_series {

public static void main(String[]args)
{
	int n1 = 0, n2 = 1, i,  n3;
	int count = 15;
	
	System.out.print(n1+" "+n2 );
	
	for(i=2; i<count; i++)
	{
		n3 =n1+n2;
		System.out.print(" " +n3);
		n1 = n2;
		n2 = n3;
	}
	
}
}
