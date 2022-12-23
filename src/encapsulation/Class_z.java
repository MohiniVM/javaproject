package encapsulation;

public class Class_z 
{
	int empid;
	String name;
	
	public void setempid(int emp,String NAME) {
	      empid = emp;
		name= NAME;
	}
	public  int getempid() {
		return empid;
	}
	
	public String getempname() {
		return name;
	}
    public static void main (String []args)
  {    Class_z ref = new Class_z();
       ref.setempid(100, "Mohini");
       int value = ref.getempid();
       String name = ref.getempname();
       System.out.println(value);
       System.out.println(name);
}
	
	
	
	
	
}
	


    