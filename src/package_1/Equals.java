package package_1;

public class Equals {

	public static void main(String[] args) {
		
		String str1 = "Name";
		String str2 = "Name";
		String str3 = new String("Name");
		String str4 = new String("Name");
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str2.equals(str3));
		
		System.out.println(str1==str2);
		System.out.println(str3==str4);
        System.out.println(str2==str3);
	}

}
