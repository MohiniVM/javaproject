package access_modifier;

public class Class_Q extends Class_P
{
      void method6()
      {
    	  System.out.println("default subclass property");
      }
	
  public static void main(String[] args) {
		
	  Class_Q ref7 = new Class_Q();
	  ref7.method6();
	  ref7.method5();
	  System.out.println(ref7.i);
	}

}
