package com.springrestjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //this tells spring that this is the starting point of the Spring Boot application
public class CourseApiApp {

	public static void main(String[] args) {
		
		SpringApplication.run(CourseApiApp.class, args);  //run is static method present in SpringApplication class

		//Spring Boot scan the classpath on starting up to see if their are any class with annotations & register it
	}

}

/*  NOTE @SpringBootApplication
@SpringBootApplication groups three annotation @EnableAutoConfiguration, @Configuration & @ComponentScan.  @ComponentScan is responsible to scan the package where the application is located in order to find all components   
*/