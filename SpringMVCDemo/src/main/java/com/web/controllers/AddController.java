package com.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.service.AddService;

@Controller
public class AddController {
	
/*  @RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		int n1=Integer.parseInt(request.getParameter("t1"));  //getParameter() will return the value of a parameter that was submitted by an HTML form or that was included in a query string. it always returns String
		int n2=Integer.parseInt(request.getParameter("t2"));  //getAttribute() :  request.getAttribute(), this is all done server side. YOU add the attribute to the request and YOU submit the request to another resource, the client does not know about this
*/	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int n1, @RequestParam("t2") int n2) {  //accessing Request parameter directly from the URL http://localhost:8080/SpringMVCDemo/add?t1=2&t2=2
		
		AddService addService = new AddService();
		int sum=addService.add(n1, n2);
		
		ModelAndView mv = new ModelAndView(); //using ModelAndView we can pass the data to the view
		
		//mv.setViewName("Display.jsp");
		mv.setViewName("display"); //InterResourceViewResolver configured in ServletXmlConfig.java will resolve this automatically
		mv.addObject("result", sum);
		//return "Display.jsp";   //Mapping Controller to View.
		return mv;
		//view name is case sensitive & mentioned full name Display.jsp
	}
	
}
