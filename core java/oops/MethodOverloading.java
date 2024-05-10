package oops;

public class MethodOverloading {

	public void add(int a, int b) {
		System.out.println("6.the sum of 2 int is :-"+(a+b));
	}
	public void add(int a, int b,int c) {
		System.out.println("9.the sum of 3 int is :-"+(a+b+c));
	}
	public void add(float a, int b) {
		System.out.println("12.the sum of float nd int is :-"+(a+b));
	}
	public void add(int a, float b) {
		System.out.println("15.the sum of int nd float is :-"+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("18.the sum of 2 float's is :-"+(a+b));
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		
		obj.add('a','c' );
		
		
	}
	
}
