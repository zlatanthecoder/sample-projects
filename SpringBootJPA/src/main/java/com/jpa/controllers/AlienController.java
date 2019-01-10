package com.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jpa.models.Alien;
import com.jpa.service.AlienService;

@Controller
public class AlienController {

	@Autowired
	private AlienService alienservice;
	
	@RequestMapping("/")
	public String get() {
		return "alienform.jsp";
	}

	
	@RequestMapping("add")
	public String addAlien(Alien alien) {  //request data is getting mapped with Alien object
		//http://localhost:8080/add?id=6&name=Alien6&planet=Saturn
		
		alienservice.addAlien(alien);
		return "addSuccessful.jsp";
		
	}
	
	
	@RequestMapping("get")
	public ModelAndView getAlien(@RequestParam("id") int id) {
		//http://localhost:8080/get?id=6
		
		ModelAndView mv = new ModelAndView(); 
		Alien alien = alienservice.getAlien(id);
		mv.addObject("al", alien);
		mv.setViewName("aliendetails.jsp");		
		return mv;
	}
	
	
	@RequestMapping("delete")
	public String deleteAlien(@RequestParam("id") int id) {
		//http://localhost:8080/delete?id=6
		
		alienservice.deleteAlien(id);
		return "deleteSuccessful.jsp";
	}
	
	
	@RequestMapping("update")
	public String updateAlien(Alien alien) {
		//http://localhost:8080/update?id=5&name=Alien5&planet=Saturn

		alienservice.updateAlien(alien);
		return "updateSuccessful.jsp";
	}
	
	
	@RequestMapping("getbyplanet")
	public void getAlienByPlanet(@RequestParam("pname") String planet) {
		
		List<Alien> alienlistByPlanet = alienservice.getAlienByPlanet(planet);
		List<Alien> alienlistGreaterThanPlanet = alienservice.getAliensByPlanetGreaterThan(planet);
		List<Alien> alienlistByPlanetSortedById = alienservice.getAliensByPlanetSortedByIdDesc(planet);
		System.out.println(alienlistByPlanet);
		System.out.println(alienlistGreaterThanPlanet);
		System.out.println(alienlistByPlanetSortedById);  //[Alien [id=5, name=Alien5, planet=Mars], Alien [id=4, name=Alien4, planet=Mars], Alien [id=1, name=Alien1, planet=Mars]]
	}
}
