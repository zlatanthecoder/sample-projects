package com.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.models.Alien;
import com.springrest.repository.AlienRepository;

@Service
public class AlienService {

	@Autowired
	AlienRepository alienrepo;
	
	
	public List<Alien> getAliens() {
		return alienrepo.findAll();
	}
	
	public Alien getAlien(int id) {		
		return alienrepo.findById(id).orElse(new Alien());		
	}

	public void addAlien(Alien alien) {
		alienrepo.save(alien);		
	}

	public Alien deleteAlien(int id) {
		Alien alien = getAlien(id);
		alienrepo.deleteById(id);	
		return alien;
	}

	public void updateAlien(Alien alien) {
		Alien al = getAlien(alien.getId());
		if(al.getId()!=0)
		  alienrepo.save(alien);
		else
			addAlien(alien);
		
	}
}
