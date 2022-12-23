package logical_programs;

public class count {

	public static void main(String[] args) {
		
		String str = "AdG#@%Yaghh2349Rty";
		int upper=0, lower=0, number=0, special=0;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch>='A' && ch<'Z')
			{  upper++;
		      }else if(ch>='a' && ch<'z')
		      {
		    	  lower++;
		      }else if(ch>='0' && ch<'9')
		      {
		    	  number++;
		      }special++;
		}
		System.out.println("uppercase letters:" + upper);
		System.out.println("lowercase letters:" + lower);
		System.out.println("number:" + number);
		System.out.println("special char:" + special);
		

	}

}
