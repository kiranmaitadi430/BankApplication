package com.bankapplication;

public class ATMInterface1 {
	
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	
	public ATMInterface1(String customerName, String customerAddress, long phoneNumber, double initialDeposit) {
		
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = initialDeposit;
		System.out.println(" Account created successfully!!");
	}
	 
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public long getphoneNumber() {
		return phoneNumber;
	}
	
	public void setphoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. Current balance:" + balance);
		}else {
			System.out.println("Error: Deposit amount must be positive");
		}
	}
	
	public void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid withdrawal amount");
		}else if (amount > balance) {
			System.out.println("Insufficient funds");
		}else {
			balance -= amount;
			System.out.println("Withdrawal successful. Remaining balance:" + balance);
		}
	}
	
	public void showBalance() {
		System.out.println("Current balance:" + balance);
	}
	
}


