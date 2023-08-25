package com.example.model;

import java.io.Serializable;
import java.util.logging.Logger;

public class LoanApplication implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 231L;
	private int applicationNumber;
	private String applicantName;
	private double cibilScore;
	private double loanAmount;
	
public static Logger log = Logger.getLogger("LoanApplication");
	
	public LoanApplication() {
		super();
		log.info("Zero Argument Constructor Called");
	}
	public LoanApplication(int applicationNumber, String applicantName, double cibilScore, double loanAmount) {
		super();
		this.applicationNumber = applicationNumber;
		this.applicantName = applicantName;
		this.cibilScore = cibilScore;
		this.loanAmount = loanAmount;
		
		log.info("Parmeter Constructor Called");

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
	public String toString() {
		return "LoanApplication [applicationNumber=" + applicationNumber + ", applicantName=" + applicantName
				+ ", cibilScore=" + cibilScore + ", loanAmount=" + loanAmount + "]";
	}
	
	
}
