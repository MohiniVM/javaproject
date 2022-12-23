package keywords;

public class a_class extends b_class
{

	a_class()
	{
	
		System.out.println("non parameterised constructor");
	}
	
	a_class(int i)
	{
		super();
		System.out.println("parameerised constructor");
	}
	
	
	public static void main(String[] args) {
	
		a_class ref = new a_class(5);
	}

}
