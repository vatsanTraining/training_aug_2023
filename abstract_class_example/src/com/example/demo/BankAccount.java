package com.example.demo;

public abstract class BankAccount {

	private  double accountBalance;

	public BankAccount(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	protected abstract double deposit(double amount) ;
	protected abstract double withdraw(double amount);
}
