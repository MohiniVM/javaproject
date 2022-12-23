package access_modifier;

 class Class_P {

	 int i = 50;
	 void method5() {
	 
	 System.out.println("default access modifier property");
	 }
	 
		 
	public static void main(String[] args) {
		
		Class_P ref6 = new Class_P ();
		ref6.method5();
		System.out.println(ref6.i);
	}

}
