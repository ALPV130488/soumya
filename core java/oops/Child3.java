package oops;

class Parent5 {

	public void add(int a, int b) {

		System.out.println("The sum of a,b:-" + (a * b));
	}

}

public class Child3 extends Parent5 {

	public static void main(String[] args) {
		
		Child3 obj = new Child3();
		
		obj.add(2, 7);

	}

	
	  @Override public void add(int a, int b) {
	  
	  System.out.println("The sum of a,b:-" + (a + b)); }
	 
}
