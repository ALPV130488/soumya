package corejava;

public class Instance {

	static int staticcounter; // static global var

	int instancecounter; // instance global var

	void counter() {
		staticcounter++;	//staticcounter = staticcounter+1

		instancecounter++;

	}

	void display() {

		System.out.println("staticcounter:- " + staticcounter);

		System.out.println("Instancecounter :- " + instancecounter);

	}

	public static void main(String[] args) {

		Instance obj1 = new Instance();
		
		Instance obj2 = new Instance();
		
		Instance obj3 = new Instance();
		
		obj1.counter();//	11
		
		obj2.counter();	//21
		
		obj3.counter();// 31
		
		obj3.counter();	// 42
		
		obj3.display();
		
	}
}
