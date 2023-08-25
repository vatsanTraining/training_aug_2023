package com.example.services;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

import com.example.RangeCheckException;

public class StudentService {

	static Logger log = Logger.getLogger("StudentService");
	
	public static int findLength() throws RuntimeException{
		
      String name = null;
      int length =0;
		
		try {
			
			length =name.length();
			
			throw new RangeCheckException("Just Trying");
		} catch (RangeCheckException  e) {
			
			
			throw new RuntimeException(e.getMessage());
			//throw new Exception("Re throw Exception");
		}
		//return length;
	}
	
	
	public static void preciseThrow() throws ParseException,IOException {
	
		try {
			
			new SimpleDateFormat("yyyyMMdd").parse("date");  // Parse Exception
			new FileReader("Abc.txt").read();            // IOException

		} catch (Exception e) {
			
			throw e;
		}
	}
	
}
