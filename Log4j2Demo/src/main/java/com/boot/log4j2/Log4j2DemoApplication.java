package com.boot.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Log4j2DemoApplication {

	private static final Logger LOGGER = LogManager.getLogger(Log4j2DemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Log4j2DemoApplication.class, args);
		
		/*
		 * Spring boot’s default logging uses Logback which is included as transitive dependency. Spring Boot supports Log4j2 for logging configuration if it is on the classpath.
		 * so First remove spring’s default logging dependency (spring-boot-starter-logging) and then add log4j2 dependency (spring-boot-starter-log4j2).
		 * https://howtodoinjava.com/spring-boot2/spring-boot2-log4j2-properties/
		 * https://howtodoinjava.com/log4j2/log4j2-properties-example/
		 */
		
		LOGGER.info("info level logging");
		LOGGER.debug("debug level logging");
		LOGGER.error("error level logging");
		
	}

}

