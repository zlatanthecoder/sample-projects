package com.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.web.service.LoginService;

@Controller
public class LoginController {

/*	@RequestMapping("/login")
	public ModelAndView checkUser(HttpServletRequest request, HttpServletResponse response) {
		String username=request.getParameter("username");
		String pass=request.getParameter("password");*/
	
	@RequestMapping("/login")
	public ModelAndView checkUser(@RequestParam("username") String username, @RequestParam("password") String pass) {		
		
		ModelAndView mv = new ModelAndView();
		
		LoginService loginService = new LoginService();
				
		if(loginService.checkUser(username, pass))
			mv.setViewName("success.jsp");		
		else
			mv.setViewName("login.jsp");
		
		return mv;
	}
}
