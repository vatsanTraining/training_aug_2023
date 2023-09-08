package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Restaurant;
import com.example.demo.repos.RestaurantRepository;
import com.example.demo.utils.SqlStatement;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	  ctx=SpringApplication.run(SpringJdbcApplication.class, args);
	
	  Restaurant entityToAdd = ctx.getBean(Restaurant.class);
	  
	  RestaurantRepository repo=ctx.getBean(RestaurantRepository.class);
	
	 
//	     System.out.println(repo.add(entityToAdd) + " Row Added");
	  
		 repo.findAll().forEach(System.out::println);

	}

	@Bean
	public Restaurant data() {
		
		return new Restaurant(2032, "Murugan Idly","veg",LocalDate.of(2021, 10, 10), 4.3);
	}
}
