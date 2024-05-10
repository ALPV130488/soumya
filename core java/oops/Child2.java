package oops;

abstract class Child2 implements Parent1{	// 0-100%
	
	public abstract void display();			//100
	
	public void displayMsg() {		//0
		System.out.println("Iam from abstract class!!!");
	}
	
	public static void main(String[] args) {
		
		
		
		Child1 obj = new Child1();
		
		obj.display();
		
	}

}
