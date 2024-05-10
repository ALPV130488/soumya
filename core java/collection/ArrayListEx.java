package collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("apple");
		
		al.add(234);
		
		al.add(true);
		
		al.add(34.4f);
		
		al.add('c');
		
		System.out.println(al);
		
		al.add("fish");
		
		System.out.println(al);
		
	}
}
