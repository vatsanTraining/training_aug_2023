package com.example.model;

import java.io.Serializable;
import java.util.Objects;

import com.example.exceptions.RangeCheckException;

public class Student  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 13L;
	
	private int rollNumber;
	private String firstName;
	private String lastName;
//	private transient double markScored;
	
	private double markScored;


	public Student() throws Exception{
		this(000,"guest","guest",100);		
		
	}
	

	public Student(int rollNumber, String firstName, String lastName, double markScored) throws RangeCheckException {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		if(markScored<0) {
			throw new RangeCheckException("ERR-104 Mark Should be positive number");
		} else {
		this.markScored = markScored;
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		if(markScored<0) {
			try {
				throw new RangeCheckException("ERR-104 Mark Should be positive number");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		} else {
		this.markScored = markScored;
		}
	}


	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, markScored, rollNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Double.doubleToLongBits(markScored) == Double.doubleToLongBits(other.markScored)
				&& rollNumber == other.rollNumber;
	}


	@Override
	public String toString() {
		
		StringBuffer buffer = new StringBuffer(rollNumber).append(",").append(this.firstName)
				.append(",").append(lastName).append(",").append(markScored);
		
		return buffer.toString();
	}
	
	
	
}
