package com.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc  //replacement of <mvc:annotation-driven/>
@Configuration  //in order to make this class as Configuration class
@ComponentScan("com.web.controllers")  //replacement of <context:component-scan base-package="com.web.controllers"/> in springmvc-servlet.xml
public class ServletXmlConfig {

	//this class is the replacement of springmvc-servlet.xml file
	
	@Bean //@Bean is a method-level annotation. it will create the Bean & made available in the BeanFactory / ApplicationContext. if not use then we will get NoSuchBeanException
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
}
