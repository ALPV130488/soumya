package collection;

import java.util.Vector;
//1.Can stores  homogenous/heterogenous data.

//2.collections are not fixed in size (we can change)

//3.Utility methods.

/*LIST:-

(1)It allows duplicates

(2)Insertion order is preserved*/

public class VectorEx {

	public static void main(String[] args) {
		Vector vec = new Vector();
		
		vec.add("apple");

		vec.add(234);

		vec.add(true);

		vec.add(34.4f);

		vec.add('c');

		vec.add("boll");
		
		System.out.println(vec);
		
		
	}
}
