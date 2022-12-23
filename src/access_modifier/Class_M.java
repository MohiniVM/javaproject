package access_modifier;

public class Class_M {

	public void method7()
	{
		System.out.println("public same class");
	}
	
	
	public static void main(String[] args) {
	
		Class_M ref8 = new Class_M() ;
		ref8.method7();
	}

}
