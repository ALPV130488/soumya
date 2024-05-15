package collection;

import java.util.LinkedList;
//1.Can stores  homogenous/heterogenous data.

//2.collections are not fixed in size (we can change)

//3.Utility methods.

/*LIST:-

(1)It allows duplicates

(2)Insertion order is preserved*/
public class LinkedListEx {
	
	public static void main(String[] args) {
		
		
		LinkedList ll = new LinkedList();


		ll.add("apple");

		ll.add(234);

		ll.add(true);

		ll.add(34.4f);

		ll.add('c');

		ll.add("boll");

		ll.add("zoo");

		ll.add("ant");
		
		ll.add("apple");

		ll.add(234);

		ll.add(true);

		ll.add(34.4f);

		ll.add('c');

		ll.add("boll");
		
		System.out.println(ll);
		
		System.out.println(ll.get(7));

		
	}
	
	
}
