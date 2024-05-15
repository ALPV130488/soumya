package string;

public class StringEx2 {

	public static void main(String[] args) {

		String name1 = "apple";

		String name2 = "apple";

		System.out.println(name1 == name2);//true

		System.out.println(name1.compareTo(name2));//0

		System.out.println(name1.equals(name2));//true
		
		

		String name3 = new String("apple");

		String name4 = new String("apple");

		System.out.println(name4 == name3);//false

		System.out.println(name4.compareTo(name3));//0

		System.out.println(name4.equals(name3));//true
		
		
		
		
		StringBuffer name5 = new StringBuffer("apple");
		
		StringBuffer name6 = new StringBuffer("apple");
		
		System.out.println(name6 == name5);//false

		System.out.println(name6.compareTo(name5));//0

		System.out.println(name6.equals(name5));//false
		
		System.out.println(name6.capacity());
		
		

	}

}
