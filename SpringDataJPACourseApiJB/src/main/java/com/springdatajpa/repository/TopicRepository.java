package com.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.springdatajpa.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
