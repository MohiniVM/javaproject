package TestPackage;

public class constructor {
	constructor()      //non parameterized constructor
	{
	   System.out.println("execution of non parameterized constructor");
	}
    constructor(int a)    //parameterized constructor
    {
    	System.out.println("execution of parameterized constructor");
    }
    public void method1()  //non parameterized method
    {
    	System.out.println("execution of non parameterized method");
    }
    public void method1(int a)   //parameterized method
    {
    	System.out.println("execution of parameterized method");
    }
    public static void main(String[] args) {
		
    	 constructor ref =new  constructor();
    	 constructor ref2 =new constructor(3);
          ref.method1();	 
          ref.method1(6);	
	}
}
