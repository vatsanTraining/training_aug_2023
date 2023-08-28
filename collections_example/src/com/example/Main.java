package com.example;

import java.util.Set;

import com.example.ifaces.CrudRepository;
import com.example.impl.CrudRepositoryImpl;
import com.example.model.HomeLoanApplication;
import com.example.model.LoanApplication;
import com.example.model.LoanFile;
import com.example.services.HomeLoanApplicationService;
import com.example.utils.LocationType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HomeLoanApplicationService  homeLoanService=new HomeLoanApplicationService();
		
		  Set<LoanFile> loans =homeLoanService.approveLoans();
		 
		  for(LoanFile eachFile:loans) {
			  
			  System.out.println(eachFile);
		  }
	}

}
