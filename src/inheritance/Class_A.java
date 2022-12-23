package inheritance;

public class Class_A {
   public void method1() 
   {
	   int a=5, b=2;
	   int c= a+b;
	   System.out.println("addition of a and b"+" "+c);
   }
	  public static void method2()
	  {
		  int m=50, n=20;
		  int p=m-n;
		  System.out.println("substraction of m and n"+" "+p);
	  }
	 public static void main(String[] args) {
		 Class_A ref= new Class_A();
		 ref.method1();
		 method2();

	}

}
