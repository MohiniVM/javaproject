package inheritance;

public class Class_C extends Class_B
{
     public  void method4()
  {      int p=50, q=2;
         int r= p*q;
         System.out.println("multiplication of p and q :" +r);
  }
  
       public static void main(String[] args) {
		
        	Class_C ref2= new Class_C();
        	ref2.method4();
        	ref2.method3();
        	ref2.method1();
        	method2();

	}

}

