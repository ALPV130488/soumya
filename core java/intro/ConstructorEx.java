package corejava;

public class ConstructorEx {

	public ConstructorEx() {
		
		System.out.println("Iam from the default constr");
	}
	
	public ConstructorEx(String name) {
		System.out.println("The name is:-"+name);
	}
	
	public static void main(String[] args) {
		
		ConstructorEx obj  = new ConstructorEx("soumya");
		
	}
	
	
}


