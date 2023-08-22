package com.training.model;

import java.util.Objects;

public class LoanApplication {


	private int applicationNumber;
	private String applicantName;
	private double cibilScore;
	private double loanAmount;
	
	
	public LoanApplication() {
		super();
	}
	public LoanApplication(int applicationNumber, String applicantName, double cibilScore, double loanAmount) {
		super();
		this.applicationNumber = applicationNumber;
		this.applicantName = applicantName;
		this.cibilScore = cibilScore;
		this.loanAmount = loanAmount;
	}
	public int getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(int applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public double getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(double cibilScore) {
		this.cibilScore = cibilScore;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(applicantName, applicationNumber, cibilScore, loanAmount);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)   
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		
		LoanApplication other = (LoanApplication) obj;
		
		return Objects.equals(applicantName, other.applicantName) && applicationNumber == other.applicationNumber
				&& Double.doubleToLongBits(cibilScore) == Double.doubleToLongBits(other.cibilScore)
				&& Double.doubleToLongBits(loanAmount) == Double.doubleToLongBits(other.loanAmount);
	}
	@Override
	public String toString() {
		return "LoanApplication [applicationNumber=" + applicationNumber + ", applicantName=" + applicantName
				+ ", cibilScore=" + cibilScore + ", loanAmount=" + loanAmount + "]";
	}
	@Override
	protected void finalize() throws Throwable {

		System.out.println("I am leaving -miss you");
	}
	
	
	
}
