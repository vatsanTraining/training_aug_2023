package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Invoice;
import com.example.demo.services.InvoiceStreamService;
import com.example.demo.services.StreamService;
import com.example.demo.services.TransalatorService;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext ctx =
				
				new ClassPathXmlApplicationContext("applicationContext.xml");
	
		
		   
		  HelloService service =(HelloService)ctx.getBean("helloService");
		  
		  System.out.println(service.greet());
		  
		  Invoice inv = ctx.getBean(Invoice.class);
		  
		 
		  
		  System.out.println(inv);
		 System.out.println(inv.getCustomer()); 
	
		 TransalatorService tranService =
				 ctx.getBean(TransalatorService.class);
		 
		 System.out.println(tranService.transalate("rice"));
		 
		 
		 StreamService streamService = ctx.getBean(StreamService.class);
		 
		  streamService.findAll().forEach(System.out::println);

	}
	

}
