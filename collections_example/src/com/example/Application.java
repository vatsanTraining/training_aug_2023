package com.example;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.example.model.LoanApplication;
import com.example.model.LoanFile;
import com.example.services.LoanApplicationService;
import com.example.utils.LoanStatus;

public class Application {

	public static void main(String[] args) {
		
		
		
		   LoanApplicationService service = new LoanApplicationService();

		   service.add(new LoanApplication(1010, "Ramesh", 780, 100000));
		   service.add(new LoanApplication(1020, "Suresh", 880, 200000));
		   service.add(new LoanApplication(1020, "Suresh", 880, 200000));
		   service.add(new LoanApplication(1030, "Anand", 580, 500000));
		   service.add(new LoanApplication(1040, "Yash", 680, 700000));
		   service.add(new LoanApplication(1060, "Basker", 780, 300000));


	             List<LoanApplication> list = service.sortedByProp("applicantname");
	             
	             
	             for(LoanApplication eachApplication:list) {
	            	 System.out.println(eachApplication);
	             }
	            
	             Set<LoanFile> files = service.approveLoans();
	            
	              for(LoanFile eachFile : files) {
	            	  
	            	  System.out.println(eachFile);
	            	  
	              }
	             
	              
	             Map<String, Double> mapped = service.getLoanDetails();
	             
	                Set<Map.Entry<String, Double>>   setView   = mapped.entrySet();
	                
	                for(Map.Entry<String, Double> eachElement:setView) {
	                	
	                	System.out.println(eachElement.getKey() + ","+eachElement.getValue());
	                	
	                }

	             
		             Map<String, Double> map = service.getLoanDetails();
		             
		           Set<String> keys = map.keySet();
		             
		           System.out.println("Values with Key");
		              for(String key : keys) {
		            	  System.out.println(map.get(key));
		              }
		              
		         Collection<Double>  values   = map.values();
		         
		         System.out.println("Values");
		         for(Double eachDouble : values) {
		        	 
		        	 System.out.println(eachDouble);
		         }

	                  
		         Map<LoanStatus, Set<LoanApplication>> loans = service.processLoan();
		         
		         Set<LoanApplication> apprvoedList = loans.get(LoanStatus.APPROVED);
		         
		         Set<LoanApplication> rejectedList = loans.get(LoanStatus.REJECTED);
		         System.out.println("Approved Loans");
		         extracted(apprvoedList);
		         System.out.println("Rejected Loans");
		         extracted(rejectedList);
	}

	private static void extracted(Set<LoanApplication> apprvoedList) {
		for(LoanApplication eachApplication: apprvoedList) {
			 System.out.println(eachApplication);
		 }
	}

}
