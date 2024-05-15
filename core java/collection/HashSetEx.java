package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add("apple");

		hs.add(123);

		hs.add('c');

		hs.add(true);

		hs.add(3.14f);

		hs.add("apple");

		hs.add(123);

		hs.add('c');

		hs.add(true);

		hs.add(3.14f);

		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		

	}

}
