package com.training.services;
import com.training.*;
public class StudentService {

	private int number;
	
	public static String allotGrade(Student student) {
		
		//System.out.println(number);
		var  mark = student.getMarkScored();
		
		return allotGrade(mark);
	}
	
	/*
	 * Overloaded Method with Double as argument
	 */
	public static String allotGrade(double mark) {
		
	
		return mark>60?"A":"B";
	}
	
	
	public static String allotGradeWrapper(Double mark) {
		
		return allotGrade(mark);
	}
}
