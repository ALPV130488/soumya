package oops;

interface Parent2 {

	public void display();

	public int add(int a, int b);

}

interface Parent1 {
	
	public void display();

	public int add(int a, int b);
}

public class Child1 implements Parent1, Parent2 {

	@Override
	public void display() {
	
		System.out.println("Hi soumya");
		
	}

	@Override
	public int add(int a, int b) {
		
		return 0;
	}

	public static void main(String[] args) {
		Child1 obj  = new Child1();
		
		obj.display();
	}
	
}
