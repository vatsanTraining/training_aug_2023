package com.example.demo.config;

import java.time.LocalDate;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Restaurant;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {

	@Bean
	public Restaurant bbq(){
		
		return new Restaurant(1010, "BBQ", "pashtun", LocalDate.now(), 4.5);
	}
	
	@Bean
	public Restaurant medley(){
		
		return new Restaurant(2020, "Medley", "Veg", LocalDate.now(), 4.5);
	}
	
	@Bean
	public Restaurant twogood(){
		
		return new Restaurant(3020, "Too Good", "Veg", LocalDate.now(), 4.2);
	}

	@Bean
	public Student studentSubash() {
		
		return new Student(8484, "Subash", 80);
	}
	
	@Bean
	public Student studentSiva() {
		
		return new Student(6464, "Siva", 82);
	}
	@Bean
	public Teacher teacherTommy() {    // teache 2 
		
		return new Teacher(20230, "Tommy Nair", studentSubash());
	}
	
	@Bean
	public Teacher teacherThangam() {  // teacher 3
		return new Teacher(30230, "Thangam", studentSiva());
	}
}
