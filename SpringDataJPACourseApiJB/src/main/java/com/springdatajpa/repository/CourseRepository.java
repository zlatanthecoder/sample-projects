package com.springdatajpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springdatajpa.model.Course;

public interface CourseRepository extends CrudRepository<Course, String>{

	//Define a method with findByProperty format & Spring Data JPA will provide the implementation for you
	public List<Course> findByName(String name); //findByProperty format
	public List<Course> findByDescription(String description); //findByProperty format
	public List<Course> findByTopicId(String id);  //findByObjectField format like here Id is the property of Topic object which is the property of Course class
}
