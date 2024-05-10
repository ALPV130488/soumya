package keyword;

class Parent {
	int value = 23;

	public void display() {
		System.out.println("Hi soumya!!!");
	}

}

public class FinalEx  extends Parent{
	
	public static void main(String[] args) {
		
		FinalEx obj = new FinalEx();
		
		obj.value = 45;
		
		System.out.println(obj.value);
		
		obj.display();
	}
	
	@Override
	public void display() {
		System.out.println("Hello soumya!!!");
	}
}
