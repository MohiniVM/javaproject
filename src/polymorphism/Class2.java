package polymorphism;

public class Class2 extends  Class1                //method overriding
{
       public void test1()
	{
	  System.out.println(" method 1");
	}
	   public void test1(int a)
	{
      System.out.println(" method 2 ");
	}
	   public void test1(int a, int b)
	{
		System.out.println(" method 3 ");
	}
	   
       public static void main(String[] args) {
    	   Class2 M2 = new Class2 ();
         M2.test1();
         M2.test1(10);
         M2.test1(20, 30);
	}

}
