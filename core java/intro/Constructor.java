package corejava;

public class Constructor {

	public Constructor() {	//	5//default constructor
		this("apple");					//current class constructor 
		System.out.println("Iam from default constructor");
		
	}

	public Constructor(String name) {	//4	//parametrized constructor
		this("box","cat");
		System.out.println(name);
	}

	public Constructor(String name,String name1) {//3 //parametrized constructor
		this("den","egg","fish");
		
		System.out.println(name+" "+name1);
	}

	public Constructor(String name,String name1,String name2) { //2//parametrized constructor
		this("girl","hen","ink","jam");
		System.out.println(name+" "+name1+" "+name2);
	}

	public Constructor(String name,String name1,String name2,String name3) {		//1
		System.out.println(name+" "+name1+" "+name2+" "+name3);
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor();		//obj initializing
	}

}
