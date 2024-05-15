package collection;

import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(101,"bootstrap");
		tm.put(100,"bootstrap");
		tm.put(33,"run");
		tm.put(34,"hello");
		tm.put(122,"good");
		
		System.out.println(tm.get(34));
		
		System.out.println(tm);
		
		
	}

}
