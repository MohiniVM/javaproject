package casting;

public class A_CLASS {

	public void method1()
	{
		System.out.println("up casting of super class");
	}
	
	public static void main(String[] args) {
		
		A_CLASS ref = new A_CLASS();
	     ref.method1();  
		
	     A_CLASS ref2 = new B_CLASS();
		ref2.method1();
	}

}
