package com.example;

import java.util.Scanner;

import com.example.model.LoanApplication;
import com.example.services.LoanService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		LoanApplication app = new LoanApplication(); // use paramerized constructor
		
		LoanService service = new LoanService();
		
		 service.processLoan();
		
		sc.close();
	}

}
