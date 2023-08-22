package com.example.demo;

public class SavingAccount extends BankAccount {

	
	public SavingAccount(double balance) {
		super(balance);
	}

	@Override
	protected double deposit(double amount) {
		
		double currentBalance =getAccountBalance();
		double updated = currentBalance+amount;	
		setAccountBalance(updated);
		return updated;
	}

	@Override
	protected double withdraw(double amount) {
	setAccountBalance(getAccountBalance()-amount);
		return getAccountBalance();
	}

	
}
