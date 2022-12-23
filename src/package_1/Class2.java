package package_1;

import java.util.HashSet;
import java.util.Iterator;

public class Class2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet s = new HashSet();
      s.add(20);
      s.add(null);
      s.add(40);
      s.add(null);
      s.add("MOHIINI");
      s.add(20);
      
     Iterator it = s.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
      }
	}


