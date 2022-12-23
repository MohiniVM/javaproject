package keywords;

public class b_class
{

	b_class()
	{
		this(6);
		System.out.println("superclass non paramerised constructor");
	}
	
	b_class(int j)
	{
		System.out.println("superclass parametrised constructor");
	}
	
	
	public static void main(String[] args) {
		
       b_class ref = new b_class();
	}

}
