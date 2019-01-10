package com.springrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.models.Alien;
import com.springrest.services.AlienService;

@RestController  //this tells that this is Spring Rest controller. same as jersey @Path annotation
@RequestMapping("aliens")
public class AlienController {
	
	//whenever you send data from server to client then server is producing
	//whenever server is accepting the data from the client then server is consuming

	@Autowired
	private AlienService alienservice;
	
	
	//@GetMapping(path="aliens", produces= {"application/xml","application/json"}) //no need to mentioned GET request explicitly. produces="application/xml" will restrict the data format
	@GetMapping(produces= {"application/xml","application/json"})
	public List<Alien> getAliens() {
		//http://localhost:8080/aliens
				 
		return alienservice.getAliens();						
	}
	
	
	@RequestMapping("{id}")
	public Alien getAlien(@PathVariable("id") int id) { //we use @PathVariable in Spring REST & @PathParam in Jersey as its JAX-RS annotation
		//http://localhost:8080/aliens/2
		
		return alienservice.getAlien(id);  //jackson jars are responsible to convert java object into json
	}
	
	
	@PostMapping(path="add", consumes="application/json") //consumes="application/json" is restricting the server to accept only data in JSON format from the client
	public Alien addAlien(@RequestBody Alien alien) { //for sending raw data in request body we have to use @RequestBody annotation
		//http://localhost:8080/aliens/add
		
		alienservice.addAlien(alien);
		return alien;
	}
	
	
	@DeleteMapping("delete/{id}")
	public Alien deleteAlien(@PathVariable("id") int id) {
		//http://localhost:8080/aliens/delete/6
		
		return alienservice.deleteAlien(id);
	}
	
	
	@PutMapping("update")
	public Alien updateAlien(@RequestBody Alien alien) {
		//http://localhost:8080/aliens/update
		
		alienservice.updateAlien(alien);
		return alien;
	}
}
