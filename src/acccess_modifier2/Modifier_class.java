package acccess_modifier2;

import access_modifier.New_class;

public class Modifier_class extends New_class
{
       protected void method4()
     {
    	  System.out.println("protected another class"); 
     }
	
	public static void main(String[] args) {
		
		Modifier_class ref4 = new Modifier_class();
		ref4.method4();
		ref4.method2();
		System.out.println(ref4.i);
	}

	
}
