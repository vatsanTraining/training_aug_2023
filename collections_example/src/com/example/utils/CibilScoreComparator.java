package com.example.utils;

import java.util.Comparator;

import com.example.model.LoanApplication;

public class CibilScoreComparator implements Comparator<LoanApplication> {

	@Override
	public int compare(LoanApplication o1, LoanApplication o2) {
		
		if(o1.getCibilScore() >o2.getCibilScore()) return -1;
				if(o1.getCibilScore()<o2.getCibilScore()) return 1;
		return 0;
	}

}
