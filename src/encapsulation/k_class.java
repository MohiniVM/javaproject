package encapsulation;

public class k_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Class_z ref = new Class_z();
	       ref.setempid(100, "Mohini");
	       int value = ref.getempid();
	       String name = ref.getempname();
	       System.out.println(value);
	       System.out.println(name);

	}
	}
