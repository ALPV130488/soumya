package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add("apple");

		lhs.add(123);

		lhs.add('c');

		lhs.add(true);

		lhs.add(3.14f);

		lhs.add("apple");

		lhs.add(123);

		lhs.add('c');

		lhs.add(true);

		lhs.add(3.14f);
		
		System.out.println(lhs);
		
		

	}
}
