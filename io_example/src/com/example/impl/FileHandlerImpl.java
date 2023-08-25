package com.example.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.example.exceptions.RangeCheckException;
import com.example.ifaces.FileHandler;
import com.example.model.Student;

public class FileHandlerImpl implements FileHandler {

	@Override
	public boolean writeToFile(Student student, File file) throws IOException {   //1

		boolean result =false;
		
		try(PrintWriter writer =new PrintWriter(new FileWriter(file, true));) {   //2
			
			writer.println(student);
		   
			result =true;
		   
		} catch (IOException e) {
			throw e;   //3
		}
				
		return result;
	}

	@Override
	public Student[] readFromFile(File file)  throws IOException,RangeCheckException {

		
		Student[] nameList =new Student[6];
		
		int idxPos = 0;
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file));) {
			
			
			String line =null;
			
			while( (line =reader.readLine())!=null ) {
				
			String[] values	=line.split(",");
				
			    Student obj = new Student(Integer.parseInt(values[0]),
			    		   values[1], values[2], Double.parseDouble(values[3]));
			    
			    nameList[idxPos]= obj;
			    idxPos++;
			}
			
		} catch (RangeCheckException |IOException e) {
                  throw e;
		}
		
		
		
		return nameList;
		
	}

}
