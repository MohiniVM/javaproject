package interface_package;

public class ABCD implements Test  
{
	public void test1()
	{
		System.out.println("addition");
	}
     public void test2()
     {
    	 System.out.println("substraction");
     }
     public void test3()
     {
    	 System.out.println("multiplication");
     }
     public static void main(String[] args) {
		
    	 ABCD ref = new ABCD ();
    	 ref.test1();
    	 ref.test2();
    	 ref.test3();

	}

}
