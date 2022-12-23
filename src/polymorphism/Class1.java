package polymorphism;

public class Class1 {                          // overloading
    public void test1()
    {
   System.out.println("property of method 1");    //method with zero argument 
    }
	public void test1(int m)
	{
   System.out.println("property of method 2 ");   //method with single argument
	}
	public void test1(int n, int r )
	{
   System.out.println("property of method 3 ");   //method with double argument
	}
       public static void main(String[] args) {
		
    	   Class1 M1 = new Class1 ();
    	   M1.test1();
    	   M1.test1(5);
    	   M1.test1(20, 40);
    	   
	}

}
