package TestPackage;

public class parameter {

	public static void test1()  
{   System.out.println("zero parameter execution");
   }
	public void test1(int a) 
{	System.out.println("with 1 parameter execution");
}
	public void test1(int a,int b) 
{  System.out.println("with 2 parameter execution");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     test1();                   //calling static method
      parameter demo=new parameter();
     demo.test1(10);           //calling non static method
     demo.test1(20,30);
	}
	}
