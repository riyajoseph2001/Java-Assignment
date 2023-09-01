package com.nissan.bean;
//Question 2
public class Account {
	private double balance=0.0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if(balance>amount) {
			this.balance=this.balance-amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}
	public void deposite(double amount) {
		this.balance=this.balance+amount;
	}
	

}
