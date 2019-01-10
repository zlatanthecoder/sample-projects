package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.models.Alien;

public interface AlienDAO extends CrudRepository<Alien, Integer>{  //mentioned the class name & Type of primary key in that class
	//AlienRepository
	 	
	//method name should start by findBy or getBy & end with the property name like here Planet is the property of Alien entity
	List<Alien> findByPlanet(String planet); 

	//method name should ends with the operations
	List<Alien> findByPlanetGreaterThan(String planet);
	
	//JPQL (Java Persistence Query Language)
	//?1 means replace this with 1st parameter
	@Query("from Alien where planet=?1 order by id desc")  //table name is case sensitive
	List<Alien> findByPlanetSortedByIdDesc(String planet);
}
