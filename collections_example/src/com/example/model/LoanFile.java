package com.example.model;

import java.util.Objects;
import java.util.UUID;

public class LoanFile  implements Comparable<LoanFile>{
	
	private UUID fileNumber;
	private String borrower;
	private double sancationedAmount;
	private int loanTenure;
	private double emi;
	
	
	public LoanFile(UUID fileNumber, String borrower, double sancationedAmount, int loanTenure, double emi) {
		super();
		this.fileNumber = fileNumber;
		this.borrower = borrower;
		this.sancationedAmount = sancationedAmount;
		this.loanTenure = loanTenure;
		this.emi = emi;
	}
	public UUID getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(UUID fileNumber) {
		this.fileNumber = fileNumber;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public double getSancationedAmount() {
		return sancationedAmount;
	}
	public void setSancationedAmount(double sancationedAmount) {
		this.sancationedAmount = sancationedAmount;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	
	

	

	@Override
	public int hashCode() {
		return Objects.hash(borrower, emi, loanTenure, sancationedAmount);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanFile other = (LoanFile) obj;
		return Objects.equals(borrower, other.borrower)
				&& Double.doubleToLongBits(emi) == Double.doubleToLongBits(other.emi) && loanTenure == other.loanTenure
				&& Double.doubleToLongBits(sancationedAmount) == Double.doubleToLongBits(other.sancationedAmount);
	}
	@Override
	public String toString() {
		return "LoanFile [fileNumber=" + fileNumber + ", borrower=" + borrower + ", sancationedAmount="
				+ sancationedAmount + ", loanTenure=" + loanTenure + ", emi=" + emi + "]";
	}
	@Override
	public int compareTo(LoanFile otherObj) {
		return borrower.compareTo(otherObj.borrower);
	}
	
	

}
