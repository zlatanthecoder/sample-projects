package com.springrestjb.controller;  //classes should be inside the package in which main class resides otherwise it wont work. ex: main class present inside com.springrestjb so our classes should be present inside com.springrestjb.{our_package} 

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //in order to make any class a Rest Controller we need to use this annotation
public class HelloController {

	@RequestMapping("/hello") //the @RequestMapping maps only to the GET method by default. to map to other HTTP method, you'll have to specify it in the annotation
	public String sayHi() {		
		return "Hi";
	}
}
