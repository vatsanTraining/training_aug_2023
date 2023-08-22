package com.example.demo;

public class Application {

	public static void print(BankAccount[] accounts) {
		for(BankAccount eachAccount: accounts) {
			
			// Dynamic Method Dispatch

			System.out.println(eachAccount.getAccountBalance());
		}
	}
	
	public static void main(String[] args) {
		
		//superclass = subclass
		
		BankAccount ramAccount =
				new SavingAccount(1000);
		BankAccount shyamAccunt =
				new SavingAccount(2000);

		ramAccount.deposit(1000);
		ramAccount.deposit(5000);
		ramAccount.deposit(4000);
		
		ramAccount.withdraw(3000);  //8000

		shyamAccunt.deposit(2000);
		shyamAccunt.deposit(10000);
		shyamAccunt.deposit(8000);
		
		shyamAccunt.withdraw(6000);  //16000

		BankAccount abcLimited = new CurrentAccount(5000);
		
		 abcLimited.deposit(25000);
		 abcLimited.deposit(50000);
		 abcLimited.deposit(250000);//80000
		BankAccount xyzLimited = new CurrentAccount(2000);
		
		  xyzLimited.deposit(25000);
		  xyzLimited.deposit(50000);
		 abcLimited.withdraw(150000);//77000

		BankAccount[] accounts = {ramAccount,shyamAccunt,abcLimited,xyzLimited};

		 print(accounts);
		
		 		 
		 
//		System.out.println("Current Balance Expected : 2000 =>Actual :"+ ramAccount.deposit(1000));
//		
//		System.out.println("Current Balance Expected : 4000 =>Actual :"+ ramAccount.deposit(2000));
//
//		System.out.println("Current Balance Expected : 2000 =>Actual :"+ ramAccount.withdraw(2000));


	}
}
