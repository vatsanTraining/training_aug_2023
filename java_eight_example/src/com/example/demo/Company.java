package com.example.demo;

import java.util.Objects;

public class Company {

	private String companyName;
	private String structure;
	private int employeeCount;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(String companyName, String structure, int employeeCount) {
		super();
		this.companyName = companyName;
		this.structure = structure;
		this.employeeCount = employeeCount;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", structure=" + structure + ", employeeCount=" + employeeCount
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(companyName, employeeCount, structure);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(companyName, other.companyName) && employeeCount == other.employeeCount
				&& Objects.equals(structure, other.structure);
	}

	
}
