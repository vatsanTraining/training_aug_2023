package com.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.example.ifaces.CrudRepository;
import com.example.impl.CrudRepositoryImpl;
import com.example.model.HomeLoanApplication;
import com.example.model.LoanApplication;
import com.example.model.LoanFile;
import com.example.services.LoanApplicationService;
import com.example.utils.LocationType;

public class HomeLoanApplicationService extends LoanApplicationService {
	
	private CrudRepository<LoanApplication> repo;
	
	

	public  HomeLoanApplicationService() {
		super();
		
		this.repo=new CrudRepositoryImpl();
		
	}



	@Override
	public Set<LoanFile> approveLoans() {

		         
	      List<LoanApplication> list = repo.findAll();
	      
	      Set<LoanFile> loanFiles = new HashSet<>();
	      
	      for(LoanApplication eachApplication : list) {
	    	  
	    	   if(eachApplication.getLoanAmount() <1000000) {
	    		   
					double emi = calculateEmi(eachApplication.getLoanAmount(), 36,(0.075/12));
					
					LoanFile file = new LoanFile(UUID.randomUUID(), 
							 eachApplication.getApplicantName(), eachApplication.getLoanAmount(), 15*12, emi);

					loanFiles.add(file);
	    	   } else {
	    		   
	    		   
	    		  HomeLoanApplication homeLoan = (HomeLoanApplication)eachApplication;
	    		  
	    		  if(homeLoan.getLocType().equals(LocationType.URBAN)) {
	    			  
	    		  }else {
	    			  
	    		  }
	    	   }
	    	   
	      }
	      return loanFiles;
	         
	}

	
}
