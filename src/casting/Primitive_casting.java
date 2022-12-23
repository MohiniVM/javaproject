package casting;

public class Primitive_casting {

	static int a= 25;          //implicit casting
    static double d= a;
    
    static double b= 55.20;     //explicit casting
    static int c = (int)b;
	
	public static void main(String[] args) {
		
		System.out.println("before casting :" +a);
		System.out.println("after casting :" +d);
		
		System.out.println("before casting :" +b);
		System.out.println("after casting :" +c);
		
	}

}
