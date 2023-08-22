package com.example.model;

public class LoanApplication {

	private int applicationNumber;
	private String applicantName;
	private double cibilScore;
	private double loanAmount;
	
	
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
}
