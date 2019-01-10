package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.models.Alien;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication {

	public static void main(String[] args) {
		
		//run() method return ConfigurableApplicationContext object so we can hold that object also
		//SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);
		Alien alien = context.getBean(Alien.class);  //Spring framework is injecting Alien bean from the container
		
		System.out.println(alien.getAlienLaptopBrand());
		
	}

}

