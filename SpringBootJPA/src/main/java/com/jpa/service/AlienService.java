package com.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dao.AlienDAO;
import com.jpa.models.Alien;

@Service
public class AlienService {

	@Autowired
	private AlienDAO aliendao;

	public void addAlien(Alien alien) {
		
		aliendao.save(alien);  //save method work for insert command
		
	}

	public Alien getAlien(int id) {
		Alien alien = new Alien();
		Optional<Alien> alienOptional = aliendao.findById(id);  //Optional class is introduced in Java 8 to prevent NullPointerException
		//Alien alien = aliendao.findById(id).orElse(new Alien());  //means if Alien object is not present with that ID then create a new Alien object & return that object
		//Alien alien = aliendao.findById(id).orElse(null);  //means if Alien object is not present with that ID then get a null default value
		//Alien alien = aliendao.findById(id).orElseThrow(() -> new NotFoundEntity(id));  //Suppose that if the entity is found you want to return it, else you want to throw an exception
		if(alienOptional.isPresent())
		   return alienOptional.get();
		
		return alien;
		
		/*Optional usage
		 * 
		*/
		
	}

	public void deleteAlien(int id) {
		
		aliendao.deleteById(id);		
	}

	public void updateAlien(Alien alien) {
		
		aliendao.save(alien);  //save call works for update command
		
	}

	public List<Alien> getAlienByPlanet(String planet) {
		
		return aliendao.findByPlanet(planet);		 
	}
	
	
	public List<Alien> getAliensByPlanetGreaterThan(String planet) {
		return aliendao.findByPlanetGreaterThan(planet);
	}
	
	
	public List<Alien> getAliensByPlanetSortedByIdDesc(String planet) {
		return aliendao.findByPlanetSortedByIdDesc(planet);
	}

	
	 
}
