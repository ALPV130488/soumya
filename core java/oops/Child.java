package oops;

import java.util.Scanner;

class GrandParent {
	public void display() {
		System.out.println("Iam from the grandparent class");
	}
}

class Parent extends GrandParent{
	
	public void displayMsg() {
		
		System.out.println("Iam from the parent class ");
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
}



public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Child obj = new Child();
		
		obj.displayMsg();
		
		System.out.println(obj.mul(2, 6));
		
		obj.display();
		
		
		
	}

}
