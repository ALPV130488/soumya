package keyword;

class Parent2 {
	String name;

	public void display(String name) {

		this.name = name;

	}
}

public class ThisEx extends Parent2 {
	
	public static void main(String[] args) {
		
		ThisEx obj = new ThisEx();
		
		String name ="child";

		obj.display("apple");
		
		System.out.println(obj.name);
		
		System.out.println(name);

	}

}
