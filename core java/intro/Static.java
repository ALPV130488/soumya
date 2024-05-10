package corejava;

public class Static {
	
	String name = "soumya";		//instance global var
	
	static String name1 = "sri";		//static global var
	
	public static void main(String[] args) {
		
		System.out.println(Static.name1);
		
		System.out.println(name1);
		
		Static obj = new Static();	//object creation
		
		System.out.println(obj.name);
		
		
	}

}
