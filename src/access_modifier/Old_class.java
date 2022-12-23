package access_modifier;

public class Old_class {

	private int a= 10;
	private void method1()
	{
		System.out.println("same class property");
	}
	
	public static void main(String[] args) {
		Old_class ref = new Old_class();
		ref.method1();
		System.out.println(ref.a);
	}

}
