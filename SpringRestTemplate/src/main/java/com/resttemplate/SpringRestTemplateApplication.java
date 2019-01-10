package com.resttemplate;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestTemplateApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringRestTemplateApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestTemplateApplication.class, args);
	}

}

