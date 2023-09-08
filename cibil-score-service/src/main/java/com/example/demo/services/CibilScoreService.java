package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.CibilScore;
import com.example.demo.repos.CibilScoreRepository;

public class CibilScoreService {

	
	CibilScoreRepository repo;

	public CibilScoreService(CibilScoreRepository repo) {
		super();
		this.repo = repo;
	}
	
	public int add(CibilScore score) {
		
		return this.repo.add(score);
	}
	
	public List<CibilScore> findAll(){
		
		return this.repo.findAll();
	}
	
	public CibilScore findById(String id) {
		
		return this.repo.findById(id).get();
	}
}
