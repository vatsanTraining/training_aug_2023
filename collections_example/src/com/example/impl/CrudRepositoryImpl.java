package com.example.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.ifaces.CrudRepository;
import com.example.model.LoanApplication;

public class CrudRepositoryImpl implements CrudRepository<LoanApplication> {
	
	private List<LoanApplication> loanList;
	

	public CrudRepositoryImpl() {
		super();
		
		loanList = new ArrayList<>();
	}

	@Override
	public int add(LoanApplication entity) {
		return loanList.add(entity)?1:0;
	}

	@Override
	public List<LoanApplication> findAll() {
		return loanList;
	}

}
