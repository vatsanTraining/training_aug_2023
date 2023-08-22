package com.example.services;
import com.example.model.*;
public class LoanService {
	
	private LoanApplication application;
	

	public LoanService(LoanApplication application) {
		super();
		this.application = application;
	}

	public LoanService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param applications
	 * @return list of loan applications
	 * 
	 * overloaded method
	 */

   public LoanApplication processLoan() {
		
		return null;
	}
	
   /*
    *  Loan Amount is calculated based on the Cibil Score
    *  If the CibilScore > 700 loanAmount is 500000
    *  if cibilScore >500 < 700 loanAmount is 300000
    *  other cases its 100000
    */
   public LoanApplication[] processLoan(LoanApplication[] applications) {
		//iterate
	    //extract the cibilscore
	   // check condition
	   // set the loaAmount
		return null;
	}
	
	
}

