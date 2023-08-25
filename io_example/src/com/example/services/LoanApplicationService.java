package com.example.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.model.LoanApplication;

public class LoanApplicationService {

	public static Logger log = Logger.getLogger("LoanApplication");

	public boolean writeAsObject(LoanApplication ...apps)  throws IOException{
	
		log.info("Calling write as object");
		boolean result = false;
		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(new File("loanApp.ser")))) {
		
			 outStream.writeObject(apps);
			 result = true;
			 
				log.info("write as object completed");

		} catch (IOException e) {
			log.info("Inside the catch Block");
              throw e;
		}
		
		return result;
	}
	
	
	public LoanApplication[] readAll() throws ClassNotFoundException, IOException {
	
		LoanApplication[] list =null;
		try (ObjectInputStream outStream = new ObjectInputStream(new FileInputStream(new File("loanApp.ser")))) {
			
			list  =  (LoanApplication[]) outStream.readObject();
		} catch (IOException e) {
             throw e;
		}
		return list;
		}
	
	
	public static void main(String[] args) {
		
		 LoanApplicationService service = new LoanApplicationService();
		   try {
			//service.writeAsObject(new LoanApplication(1000,"Shiva",560,800000),new LoanApplication(1000,"Shiva",560,800000));
		
			    LoanApplication[] apps= service.readAll();
			    

			     for(LoanApplication eachApplication : apps) {
			    	 System.out.println(eachApplication);
			     }
		   } catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
