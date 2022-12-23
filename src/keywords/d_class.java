package keywords;

public class d_class extends c_class
{
       int a = 50;
       
       public void method()
       {
    	   int a = 100;
    	   
    	   System.out.println(a);         //local variable
    	   System.out.println(this.a);    //instance variable from current class
    	   System.out.println(super.a);   //instance variable from super class
       }
	
	public static void main(String[] args) {
		
           d_class  ref = new d_class();
           ref.method();
	}

}
