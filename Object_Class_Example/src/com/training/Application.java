package com.training;

import com.training.model.LoanApplication;
import com.training.model.MyUtils;

public class Application {
	
	public static void print() {
		
		LoanApplication app2 = new LoanApplication();
		
		app2 = null;
	}

	public static void main(String[] args) {

		LoanApplication ramApp1 = new LoanApplication(1010, "Ramesh", 780, 100000);
		
		LoanApplication ramApp2 = new LoanApplication(1010, "Ramesh", 780, 100000);

		LoanApplication ramApp3 = ramApp1;
		
		System.out.println("IS Equal  Expect:True Actual:=>"+ ramApp1.equals(ramApp2));
		
		
		
		System.out.println("IS Equal with reference  Expect:True Actual:=>"+ ramApp1.equals(ramApp3));

		
		String name ="Ram";
		
		System.out.println("Check for Equlity with Different Types:=>"+ ramApp1.equals(name));
		
		String ramApp4 = null;
		
		System.out.println("Check for Equlity with Different Types:=>"+ ramApp1.equals(ramApp4));

		MyUtils util = new MyUtils();
		
		System.out.println(ramApp1);
		
		print();
		
		System.gc();
		
		System.out.println("Done");
		
	}

}
