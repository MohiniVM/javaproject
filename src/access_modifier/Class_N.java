package access_modifier;

public class Class_N  extends Class_M 
{
      public void method8 ()
      {
    	 System.out.println("public subclass property");
      }
	
	
	public static void main(String[] args) {
		
		Class_N ref = new Class_N();
		ref.method8();
		ref.method7();
		
	}

}
