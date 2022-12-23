package package_1;

public class String_methods {

	public static void main(String[] args) {
		
		String str1 = "MOHINI";
		String str2 = "MISAR";
		String str3 = " ";
				
		System.out.println(str1.length());
		System.out.println(str1.charAt(4));
	    System.out.println(str1.concat(str2));
	    System.out.println(str1.equals(str2));
	    System.out.println(str1.indexOf(4));
	    System.out.println(str1.isEmpty());
	    System.out.println(str1.trim());
	    System.out.println(str1.toLowerCase());
	    System.out.println(str1.startsWith("M"));
		System.out.println(str2.length());
		System.out.println(str3.isBlank());
		
	}

}
