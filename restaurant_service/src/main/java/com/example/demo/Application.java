package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.hsbc.demo.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.dao.RestaurantDaoImpl;
import com.example.demo.model.Restaurant;
import com.example.demo.model.Teacher;
import com.example.demo.services.RestaurantService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","org.hsbc.demo"})
public class Application {

	public static void main(String[] args) {

	ConfigurableApplicationContext 	ctx =SpringApplication.run(Application.class,args);
	
	 List<Restaurant> list= ctx.getBean(RestaurantDaoImpl.class).findAll();
	 
	  list.forEach(System.out::println);
	  
	  
	  System.out.println(ctx.getBean("teacherTommy",Teacher.class));
	  
	  System.out.println(ctx.getBean("teacherThangam",Teacher.class));
	  
	   Teacher teacher = ctx.getBean("teacher",Teacher.class);
	   
	    teacher.getList().forEach(System.out::println);
	    
	    System.out.println(ctx.getBean(EmailService.class));
	    
	    System.out.println(ctx.getBean(RestaurantService.class).getDao());

//	ctx.close();
	}

	
	}
