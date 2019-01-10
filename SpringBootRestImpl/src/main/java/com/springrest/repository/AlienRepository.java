package com.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springrest.models.Alien;

public interface AlienRepository extends JpaRepository<Alien, Integer> {//CrudRepository<Alien, Integer>{

	/*CrudRepository<T, ID>=T is the class for which this repository wants to perform CRUD operations. T is the Entity class
	 & ID is the type of the primary key in that Entity class
	 CrudRepository=an interface that allows us to do CRUD (create, read, update, delete) operations.
	  */
	//JpaRepository has features of CrudRepository plus some extra features
	
}
