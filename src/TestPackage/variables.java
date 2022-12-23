package TestPackage;

public class variables {

	int m=50;            //instance variable / non static variable
	static int n=20;     //class variable /static variable

	public void test()
{    int a=30, b=5;          //local variable
	System.out.println(a-b);
}
	public static void main(String[] args) {
	variables ref=new variables();
	
	System.out.println(ref.m);
	System.out.println(n);
	System.out.println(variables.n);
    ref.test();
}}
