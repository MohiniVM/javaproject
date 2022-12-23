package inheritance;

public class Class_B extends Class_A      //sub class
{
	  public void method3()
	  {
		  System.out.println("hello");
	  }
          
	public static void main(String[] args) {
		  
		Class_B ref1= new Class_B();
		ref1.method3();
		ref1.method1();
		method2();
	}

}
