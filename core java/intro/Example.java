package corejava;

public class Example {
	
	static String nationality ="Indian";
	
	int aadhar ;
	
	void display() {
		
		System.out.println("Nationality :-" + nationality);
		
		System.out.println("Aadhar :-" + aadhar);
	}
	
	public static void main(String[] args) {
		
		Example obj1 = new Example();
		
		Example obj2 = new Example();
		
		Example obj3 = new Example();
		
		obj1.aadhar = 123234;
		
		obj2.aadhar =23445;
		
		obj3.aadhar =977645;
		
		obj1.display();
		
		obj2.display();
		
		obj3.display();
		
	}

}
