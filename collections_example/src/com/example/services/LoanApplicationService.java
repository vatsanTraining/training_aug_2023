package com.example.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import com.example.ifaces.CrudRepository;
import com.example.impl.CrudRepositoryImpl;
import com.example.model.LoanApplication;
import com.example.model.LoanFile;
import com.example.utils.CompFactory;
import com.example.utils.LoanAmountComparator;
import com.example.utils.LoanStatus;

public class LoanApplicationService {

	private CrudRepository<LoanApplication> repo;

	public LoanApplicationService() {
		super();
		
		this.repo= new CrudRepositoryImpl();
		
		}
	
		
	public boolean add(LoanApplication entity) {
		
		return this.repo.add(entity)==1?true:false;
	}
	
	public boolean add(LoanApplication ...applications ) {
		
		boolean result = false;
		for (LoanApplication eachApplication : applications) {
			result = this.add(eachApplication);
		}
		return result;
	}
	
	public List<LoanApplication> sortedByProp(String prop){
		
		prop = prop.toLowerCase();
		
		List<LoanApplication> list = repo.findAll();
		
		if(prop.equals("loanamount") || prop.equals("cibilscore")) {
			
			Comparator<LoanApplication> comp = CompFactory.getComparator(prop);
			
			Collections.sort(list,comp);
			//Collections.sort(list, Collections.reverseOrder(comp));


		} else {
			//Collections.sort(list,Collections.reverseOrder());
			Collections.sort(list);
		}
		
		
		return list;
	}
	
	protected double calculateEmi(double amount,int tenure,double interestPerMonth ) {
		
		
		return 6000;
	}
	
	public Set<LoanFile> approveLoans(){
		
	//	Set<LoanFile> files = new HashSet<>();
		
		Set<LoanFile> files = new TreeSet<>();
			
	List<LoanApplication> apps = repo.findAll();
	
		for(LoanApplication eachApplication :apps) {
			
			if(eachApplication.getCibilScore()>700) {
				
				double emi = calculateEmi(eachApplication.getLoanAmount(), 36,(0.015/12));
				
				LoanFile file = new LoanFile(UUID.randomUUID(), 
						 eachApplication.getApplicantName(), eachApplication.getLoanAmount(), 36, emi);
		
				files.add(file);
			}
			
		}
		
		return files;
	}
	
	public Map<String, Double> getLoanDetails(){
		
		Map<String, Double> map = new HashMap<>();
		
		List<LoanApplication> apps = repo.findAll();

		for(LoanApplication eachApp:apps) {
			
          map.put(eachApp.getApplicantName(), eachApp.getLoanAmount());
			
		}
		
		return map;
		
	}
	/*
	 * Method will return the map containing the set of both approved and unapproved loans
	 * where Approved and unapproved are the key of map.
	 */
	public Map<LoanStatus,Set<LoanApplication>> processLoan(){
		
		Map<LoanStatus, Set<LoanApplication>> details = new HashMap<>();
		
		Set<LoanApplication> approved = new HashSet<>();
		Set<LoanApplication> rejected = new HashSet<>();
		
		
		for(LoanApplication eachApplication: repo.findAll()) {
			
			if(eachApplication.getCibilScore()>700) {
			
				approved.add(eachApplication);
			} else {
			    rejected.add(eachApplication);
			}
		}
		
		
		details.put(LoanStatus.APPROVED, approved);
		details.put(LoanStatus.REJECTED, rejected);
		
		return details;
	}
}
