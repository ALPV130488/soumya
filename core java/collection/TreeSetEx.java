package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyOrder());
		
	
		  ts.add("apple");
		  
		  ts.add("zoo");
		  
		  ts.add("string");
		  
		  ts.add("boolean");
		  
		  ts.add("html");		
		  
		  ts.add("css");
		  
		  ts.add("react");
		  
		  ts.add("java");
		 
		  System.out.println(ts);
		
		  
		  for(Object object :ts) {
			  System.out.println(object);
		  }
		
	}

}

			


class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}
	
	
	
}
