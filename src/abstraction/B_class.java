package abstraction;

public class B_class extends A_class
{
         public void method2()
         {
        	 System.out.println(" substraction ");
         }
	
	
       public static void main(String[] args) {
	    
    	   B_class ref = new B_class();
    	   ref.method1();
    	   ref.method2();
	}

}
