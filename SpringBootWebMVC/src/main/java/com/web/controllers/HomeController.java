package com.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.models.Alien;

@Controller
public class HomeController {

/*	@RequestMapping("index")	
	public String indexName() {		
		return "index.jsp";  //spring boot has auto-configuration for searching all view pages in src/main/webapp by default. spring boot dont support jsp by default. add tomcat-jasper dependency to make jsp work
	}*/
		
	
	@RequestMapping("home") 		
	public String homeName() {
		return "home";  //fetching view name & location from application.properties file
	}
	
	
	@RequestMapping("/")
	public String sackView() {
		return "sackform";
	}
	
	@RequestMapping("/sack")
	public ModelAndView whoIsSacked(@RequestParam("name") String sname) {
		//http://localhost:8080/sack?name=Jose
		//http://localhost:8080/sack?name=Jose+Mourinho
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", sname);
		mv.setViewName("sack");
		return mv;
	}
	
	
	@RequestMapping("alien")
	public ModelAndView getAlien(Alien alien) {	//getting model object from request. Request data will automatically mapped to Alien Object
		//http://localhost:8080/alien?id=1&name=alien1&planet=Jupiter
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("al", alien);
		mv.setViewName("aliendetails");
		return mv;
	}

}
