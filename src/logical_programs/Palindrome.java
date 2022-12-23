package logical_programs;

public class Palindrome {

	public static void main(String[] args) {
		
		String S = "level";
		String R = "";
		
		for (int i = S.length()-1; i>=0; i--)
		{
			R = R+S.charAt(i);
		}
	    if (S.equals(R)) {
	    	System.out.println(" pallindrom");
	    }
	    else {
	    	System.out.println("not pallindrom");
	    }
	    System.out.println(S);
	    System.out.println(R);
	}

}
