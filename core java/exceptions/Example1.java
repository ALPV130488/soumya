package exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the numerator :-");
		
		int num = scan.nextInt();
		
		System.out.print("Enter the denominator:-");
		
		int den = scan.nextInt();
		try {
		int result = (num / den);
		
		System.out.println("The result is:- "+result);}
		catch(Exception obj) {
			System.out.println("do not enter zero as the denominator");
			
			System.out.println(obj);
		}
		
		System.out.println("Remaining 10000 lines of code");
		
		
	}

}
