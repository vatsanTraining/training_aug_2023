package com.example.model;

import com.example.utils.LocationType;

public class HomeLoanApplication  extends LoanApplication {

	private LocationType locType;

	public HomeLoanApplication(int applicationNumber, String applicantName, double cibilScore, double loanAmount,
			LocationType locType) {
		super(applicationNumber, applicantName, cibilScore, loanAmount);
		this.locType = locType;
	}

	public LocationType getLocType() {
		return locType;
	}

	public void setLocType(LocationType locType) {
		this.locType = locType;
	}

	@Override
	public String toString() {
		return "HomeLoanApplication [locType=" + locType + "]"+super.toString();
	}

	@Override
	public int compareTo(LoanApplication otherObj) {
	
		if (this.getLoanAmount() > otherObj.getLoanAmount()) return 1;
		
		if (this.getLoanAmount() < otherObj.getLoanAmount()) return -1;
       
		 return 0;				
	}
	
	
	
	
}
