package com.example;

import java.util.List;

import com.example.model.LoanApplication;
import com.example.services.LoanApplicationService;

public class Application {

	public static void main(String[] args) {
		
		
		
		   LoanApplicationService service = new LoanApplicationService();

		
	             List<LoanApplication> list = service.sortedByProp("loanamount");
	             
	             for(LoanApplication eachApplication:list) {
	            	 System.out.println(eachApplication);
	             }
		

	             
	}

}
