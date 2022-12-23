package logical_programs;

public class occurance_char {

	public static void main(String[] args) {
		
		String input = "abaabhjaabb";
		char search1 = 'a';
		char search2 = 'b';
		int count1 =  0;
		int count2 = 0;
		
		for(int i =0; i<input.length(); i++) {
			if (input.charAt(i) ==search1)
			{
				count1++;
			}else if(input.charAt(i)== search2)
			{
				count2++;
			}
		}  System.out.println(count1);
		System.out.println(count2);
	}
}
