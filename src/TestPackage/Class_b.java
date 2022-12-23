package TestPackage;

public class Class_b {
      int id;
      String name;
	  int age;
	
	  
	  Class_b(int id,String name,int age )
	  {
		this.id =id; 
		this.name=name;
		this.age= age;
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Class_b ref= new Class_b(101,"mohini",23);
 Class_b ref2 = new Class_b(102,"rohini",22);
 Class_b ref3 =new  Class_b (103,"payl",20);
}

}
