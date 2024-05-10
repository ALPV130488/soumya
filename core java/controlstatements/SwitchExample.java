package controlstatements;

public class SwitchExample {

	public static void main(String[] args) {
		
		float om = 564f;
		
		float mm = 1000f;
		
		float percentage = (om/mm)*100;
		
		System.out.print("your percentage is:-"+ percentage+"%");
		
		System.out.println();

		int gpa = (int) ((percentage/10)%10);
		
		System.out.println("your gpa is:-"+gpa);
		
		System.out.print("Your grade is:-");
		
		switch(gpa) {
		
		
		case 10 : {
			System.out.println("Distinction");
			break;
			
		}
		case 9 : {
			System.out.println("Excellent");
			break;
			
		}
		case 8 : {
			System.out.println("VeryGood");
			break;
			
		}
		case 7 : {
			System.out.println("Good");
			break;
			
		}
		case 6 : {
			System.out.println("Average");
			break;
			
		}
		case 5 : {
			System.out.println("poor");
			break;
			
		}
		default :{
			System.out.println("Fail");
			break;
		}
		
		
		
		}
	}

}
