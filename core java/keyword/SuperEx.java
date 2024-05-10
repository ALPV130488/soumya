package keyword;

class Parent1 {

	int value = 34;

	public Parent1() {
		System.out.println("Iam from parent class constructor");
	}

	public Parent1(String name) {
		System.out.println("My name is:- " + name);
	}

	public void display() {
		System.out.println("Iam from parent class method");
	}
}

public class SuperEx extends Parent1{
	int value = 56;

	public void display() {
		System.out.println("Iam from Child class method");
	}
	
	public SuperEx() {
		super();
		System.out.println(super.value);
		super.display();
	}
	
	public static void main(String[] args) {
		SuperEx obj = new SuperEx();	//constructor calling
		
		obj.display();
	}
}
