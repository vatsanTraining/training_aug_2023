package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Employee;
import com.example.demo.model.Invoice;
import com.example.demo.services.HelloService;
import com.example.demo.services.TransalatorService;

public class Main {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println(ctx.getBean(HelloService.class).greet());
		
		
		TransalatorService service = ctx.getBean(TransalatorService.class);
		
		 System.out.println(service.transalate("banana"));
		 
		 Employee emp =(Employee) ctx.getBean("ram");
		 
		 System.out.println(emp);
		 
		 System.out.println(ctx.getBean(Invoice.class));
		ctx.close();
	}

}
