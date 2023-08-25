package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.ifaces.CrudRepository;
import com.example.impl.CrudRepositoryImpl;
import com.example.model.LoanApplication;
import com.example.services.LoanApplicationService;

public class Application {

	public static void main(String[] args) {
		
		
		
		   LoanApplicationService service = new LoanApplicationService();

		
	             List<LoanApplication> list = service.sortedByProp("cibilscore");
	             
	             for(LoanApplication eachApplication:list) {
	            	 System.out.println(eachApplication);
	             }
		

	             
	}

}
