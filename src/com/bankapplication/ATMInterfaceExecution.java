package com.bankapplication;

import java.util.Scanner;

public class ATMInterfaceExecution {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=====  Welcome to Simple ATM =====");
		
		System.out.println("Enter customer name:");
		String name=sc.nextLine();
		System.out.println("Enter customer address:");
		String address=sc.nextLine();
		System.out.println("Enter customer phone number:");
		long phoneNumber =sc.nextLong();
		System.out.println("Enter initial deposit number:");
		double initialDeposit=sc.nextDouble();
		
		
		ATMInterface1 account=new ATMInterface1(name, address, phoneNumber, initialDeposit);
		
		int option;
		do {
			System.out.println("\nSelect an ATM option from below:");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your option [1-4] :");
			option=sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("\nEnter withdrawal amount:");
				double withdrawAmount=sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;
				
			case 2:
				System.out.println("\nEnter deposit amount:");
				double depositAmount=sc.nextDouble();
				account.deposit(depositAmount);
				break;
				
			case 3:
			     account.showBalance();
			     break;
			     
			case 4:
				System.out.println(" Thank you for using ATM , Goodbye");
				break;
			default:
				System.out.println(" Invalid option ,please choose between 1-4.");	
			}
			
		}while(option !=4);
		
		sc.close();
	}

}
