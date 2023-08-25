package com.example.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.ifaces.CrudRepository;
import com.example.impl.CrudRepositoryImpl;
import com.example.model.LoanApplication;
import com.example.utils.CompFactory;
import com.example.utils.LoanAmountComparator;

public class LoanApplicationService {

	private CrudRepository<LoanApplication> repo;

	public LoanApplicationService() {
		super();
		
		this.repo= new CrudRepositoryImpl();
		
		init();

	}
	
	private void init() {
		repo.add(new LoanApplication(1010, "Ramesh", 780, 100000));
		repo.add(new LoanApplication(1020, "Suresh", 880, 200000));
		repo.add(new LoanApplication(1030, "Anand", 580, 500000));
		repo.add(new LoanApplication(1040, "Yash", 680, 700000));
		

	}
	
	public List<LoanApplication> sortedByProp(String prop){
		
		
		List<LoanApplication> list = repo.findAll();
		
		if(prop.equals("loanamount") || prop.equals("cibilscore")) {
			
			Comparator<LoanApplication> comp = CompFactory.getComparator(prop);
			
			Collections.sort(list,comp);

		} else {
			Collections.sort(list);
			
		}
		
		
		return list;
	}
	
}
