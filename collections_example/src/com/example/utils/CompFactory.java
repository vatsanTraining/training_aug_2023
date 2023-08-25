package com.example.utils;

import java.util.Comparator;

import com.example.model.LoanApplication;

public class CompFactory {

	public static Comparator<LoanApplication> getComparator(String prop) {

		
		switch (prop.toLowerCase()) {

		case "cibilscore":
			return new CibilScoreComparator();
		case "loanamount":
			return new LoanAmountComparator();
		default:
			return null;
		}
		
	}

}
