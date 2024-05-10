package methods;

public class MethodEx {
	
	public void displayMsg() {		//instance - void
		System.out.println("Hi Soumya!!!");
	}
	
	public int add(int a,int b) {		//instance - int
		
		System.out.println(a+b);
		
		return  a+b;
		
	}
	
	public static String display() {		//static - string 
		return "Good Morning!!!";
	}
	
	public static void main(String []args) {	//static - void
		
		System.out.println(MethodEx.display());
		
		MethodEx obj = new MethodEx();
		
		obj.add(2, 3);
		
		obj.displayMsg();
		
		
	}

}
