package com.example;

import com.example.utils.ExceptionHandler;

public class Application {

	public static void main(String[] args) {

		
		System.out.println(ExceptionHandler.process(Integer.valueOf(20)));
		
		System.out.println(ExceptionHandler.process("twenty"));

		String[] names = {"Ram","Shyam",null};
		
		String param=null;
//		try {
//			param = names[2];
//			System.out.println(ExceptionHandler.process(param));
//			Student ram = new Student(200, "Ram", "kumar", -20);
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("ERR-102 Are you Accessing an Element From Array - check size");
//		}
//		catch(NullPointerException e) {
//			System.err.println("ERR-103 Parameter may be null - check ");
//
//		} catch (Exception e) {
//           System.err.println(e.getMessage());
//		}
//		System.out.println("DONE");
//		
		
		try {
			param = names[2];
			System.out.println(ExceptionHandler.process(param));
			//Student ram = new Student(200, "Ram", "kumar", -20);

		} catch (ArrayIndexOutOfBoundsException  | NullPointerException  e) {
                    e.getMessage();
		}
				System.out.println("DONE");

	}

}
