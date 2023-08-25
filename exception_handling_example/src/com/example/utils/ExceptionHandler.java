package com.example.utils;
import java.util.*;
import java.util.logging.Logger;
public class ExceptionHandler {

	
	// handle rule

	static Logger log = Logger.getLogger("ExceptionHandler");
	
	
	public static String process(Object obj) {
		
		String val=null;
		try {
			 val = (String)obj;

		} catch (ClassCastException e) {

			System.err.println("ERR-101  Argument should be a Number");
		}
		
		return val;
	}
	
	//Declare Rule
	
	public static Object process(String param) throws NullPointerException {
		
		String transformed= param.substring(2, 2);
		
		return transformed;
	}
	
	//try catch finally
	
	public static double processString(String value) {
		
		
		double response=0;
		try {
			response = Double.parseDouble(value);
		} catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            
            return 480;
		}
		finally {
			log.info("Inside Finally Block");
		}
		
		log.info("Outside try-catch Block");
		
		return response;
		
	}
}
