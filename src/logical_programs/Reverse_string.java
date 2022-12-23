package logical_programs;

public class Reverse_string {

	public static void main(String[] args) {
		
		String Str = "MOHINI_MISAR";
		String reversedStr = "";
		
		for(int i=Str.length()-1; i>=0; i--)
		{
			reversedStr = reversedStr+Str.charAt(i);
		
		}
		 System.out.println(reversedStr);
	}

}
