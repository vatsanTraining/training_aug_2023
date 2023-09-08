package com.example.demo;

import java.lang.annotation.Annotation;

import com.example.demo.model.Customer;
import com.training.ano.MyTable;

public class AnnotationProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer cust = new Customer();
		
		MyTable anno=  cust.getClass().getAnnotation(MyTable.class);
	
		 String tableName = anno.tableName();
		 
		 String sql = "select * from "+ tableName;
		 
		 System.out.println(sql);
	
	}

}
