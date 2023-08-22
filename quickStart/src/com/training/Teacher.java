package com.training;

public class Teacher {

	private int id;
	private String teacherName;
	private String department;
	
	
	public Teacher() {
		super();
	
	}
	public Teacher(int id, String teacherName, String department) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.department = department;
	}


	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getTeacherName() {
		return teacherName;
	}






	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}






	public String getDepartment() {
		return department;
	}






	public void setDepartment(String department) {
		this.department = department;
	}





  //student is a parameter variable
	public String showResult(Student student) {
		
		// grade is a local variable
		student.setLastName(student.getLastName()+"UPDATED");
		String grade ="B";
//		String grade;
//		System.out.println(grade);
//		System.out.println(department);
		if(student.getMarkScored()>=80) {
			grade="A";
		}
		
		return grade;
	}
	
}
