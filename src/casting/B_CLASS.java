package casting;

public class B_CLASS extends  A_CLASS {

	public void method1()
	{
		System.out.println("up casting of subclass");
	}
	public static void main(String[] args) {
		B_CLASS ref = new B_CLASS();
	  ref.method1();
	  
	}

}
