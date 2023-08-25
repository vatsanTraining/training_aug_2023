package com.example.ifaces;
import java.io.*;

import com.example.exceptions.RangeCheckException;
import com.example.model.Student;
public interface FileHandler {

	public boolean writeToFile(Student student, File file) throws IOException;
	public Student[] readFromFile(File file) throws IOException,RangeCheckException;
	
}
