package acccess_modifier2;

import access_modifier.Class_M;

public class Class_O extends Class_M
{
     public void method9()
     {
    	 System.out.println("public another package property");
     }
	
	
	public static void main(String[] args) {
	
		 Class_O ref2 =new  Class_O();
		 ref2.method9();
		 ref2.method7();
	}

}
