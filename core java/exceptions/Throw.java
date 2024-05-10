package exceptions;

public class Throw {
	
	public static void valid(int age) {
		
		if(age<18) {
			
			throw new ArithmeticException("Age must be greater than 18!!!!");
		}
		else {
			System.out.println("you can proceed to vote");
		}
		
	}
	
	public static void main(String[] args) {
		
		valid(5);
		
	}

}
