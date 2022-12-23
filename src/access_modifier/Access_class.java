package access_modifier;

public class Access_class extends New_class
{    protected void method3() 
	{
	System.out.println("protected subclass property");
	}

	
	public static void main(String[] args) {
		
		Access_class ref3 = new Access_class();
		
		ref3.method3();
		ref3.method2();
		System.out.println(ref3.i);
	}

}
