package TestPackage;

public class Calling_tech {
 
	public void method1()
  { int a=10, b=5;
		int c=a+b;
		System.out.println("addition of two number is"+" "+c);
	}
	public static void method2()
	{   int m=20, n=2;
		int o=m*n;
		System.out.println("multiplication of two number is"+" "+o);
	}
	public static void main (String[]args)
	{method2();                               //1st calling technique
		Calling_tech.method2();               //2nd calling technique
		Calling_tech ref=new Calling_tech();
		   ref.method1() ;                    //3rd calling technique	
}
} 