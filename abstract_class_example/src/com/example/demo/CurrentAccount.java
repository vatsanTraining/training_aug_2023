package com.example.demo;

public class CurrentAccount extends BankAccount {

	/**
	 * 
	 * @param accountBalance
	 * @return 
	 */
	public CurrentAccount(double accountBalance) {
		super(accountBalance);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return double 
	 */
	// the maximum amount to deposit is 100000  else return the same balance
	@Override
	protected double deposit(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	/**
	 * 
	 */
	// a minimum balance of 50000 should be maintained
	@Override
	protected double withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
