package com.training;

public class UnderGraduate extends Student {

	private String majorTopic;
	private String elective;
	
	public UnderGraduate() {
		super();
	}
	
	public UnderGraduate(int rollNumber, String firstName, String lastName, double markScored, String majorTopic,
			String elective) {
		super(rollNumber, firstName, lastName, markScored);
		this.majorTopic = majorTopic;
		this.elective = elective;
	}

	public String getMajorTopic() {
		return majorTopic;
	}

	public void setMajorTopic(String majorTopic) {
		this.majorTopic = majorTopic;
	}

	public String getElective() {
		return elective;
	}

	public void setElective(String elective) {
		this.elective = elective;
	}

	@Override
	public String toString() {
		return super.toString()+ this.majorTopic + ":"+this.elective;
	}
	
	
}
