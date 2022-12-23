package access_modifier;

public class New_class {

	protected int i = 20;
	protected void method2()
	{
		System.out.println("protected class property");
	}
	
	public static void main(String[] args) {
		
		New_class ref2 = new New_class();
		ref2.method2();
		System.out.println(ref2.i );

	}

}
