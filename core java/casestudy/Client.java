package casestudy;

import java.util.HashMap;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		HashMap<Long, Account> accounts = new HashMap<Long, Account>();

		String accHolderName;
		
		long accNo;
		
		long contactNo;
		
		String typeOfAcc;
		
		float accBal=0;
		
		Account account;
		
		boolean value = true;
		
		while(value) {
		System.out.println("Welcome to the Bank Application");
		System.out.println("*******************************");
		
		System.out.println();
		
		System.out.println("1.Create a new bank Account");
		
		System.out.println("2.Check Balance");
		
		System.out.println("3.Deposit");
		
		System.out.println("4.Withdraw");
		
		System.out.println("5.FundTransfer");
		
		System.out.println("6.Bank Statement");
		
		System.out.println("7.Check Account Details");
		
		System.out.println("Please enter your option:- ");
		
		int option = scan.nextInt();
		
		switch(option) {
		case 1 :{
			System.out.println();
			System.out.println("**********ACCOUNT REGISTRATION***********");
			System.out.println();
			
			System.out.print("Please enter your name:-");
			accHolderName = scan.next();
			System.out.print("Please enter your contact number:-");
			contactNo = scan.nextLong();
			System.out.print("Please enter the type of your account:-");
			typeOfAcc = scan.next();
			
			accNo = contactNo- 198474456;
			
			account = new Account(accHolderName, accNo, contactNo, typeOfAcc, accBal);
			
			accounts.put(accNo, account);
			
			System.out.println("congrats your account is created with the account number :-"+accNo);
			
			System.out.println();
			
			
			break;
		}
		case 2 :{
			System.out.println();
			System.out.println("**********BALANCE CHECK***********");
			System.out.println();
			
			System.out.print("Enter your account number:- ");
			accNo = scan.nextLong();
			
			account = accounts.get(accNo);
			
			accBal = account.getAccBal();
			
			System.out.println("Your account balance is:-"+accBal);
			
			System.out.println();
			
			
			
			break;
		}
		case 3 :{
			System.out.println();
			System.out.println("**********DEPOSIT MONEY***********");
			System.out.println();
			
			System.out.print("Please enter your account number:-");
			accNo = scan.nextLong();
			
			System.out.print("Please enter your deposit amount:- ");
			float depositAmount = scan.nextFloat();
			
			account = accounts.get(accNo);
			
			float existingAmount = account.getAccBal();
			
			accBal = depositAmount + existingAmount;
			
			account.setAccBal(accBal);
			
			System.out.println("Your amount is credited succesfully");
			
			System.out.println("Your current balance is :-" +accBal);
			
			
			
			break;
		}
		case 4 :{
			System.out.println();
			System.out.println("**********WITHDRAWL***********");
			System.out.println();
			break;
		}
		
		case 5 :{
			System.out.println();
			System.out.println("**********FUND TRANSFER***********");
			System.out.println();
			break;
		}
		case 6 :{
			System.out.println();
			System.out.println("**********PRINTING STATEMENT***********");
			System.out.println();
			value = false;
			break;
		}
		case 7 :{
			System.out.println();
			System.out.println("**********CHECK ACCOUNT DETAILS***********");
			System.out.println();
			break;
		}
		default :{
			System.out.println();
			System.out.println("********** Please visit us again ***********");
			System.out.println();
			value = false;
			break;
		}
			
		
		}
		}
		
	}

}
