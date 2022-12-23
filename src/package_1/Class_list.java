package package_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Class_list {

 @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(40);
		a.add(null);
		a.add("MOHINI");
		a.add('L');
		a.add(null);
		
	Iterator it = a.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}

}
