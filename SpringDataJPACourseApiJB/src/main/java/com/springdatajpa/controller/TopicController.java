package com.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springdatajpa.model.Topic;
import com.springdatajpa.service.TopicService;

@RestController
//a topic can have multiple courses & a course can consist of multiple lessons
public class TopicController {
	
	@Autowired //this will make the TopicService instance available for this class usage
	private TopicService topicservice;

	
	
	@RequestMapping("topics")
	public List<Topic> getTopics() { //this List object will be converted to JSON response automatically by Jackson jars by spring mvc as this controller is annotated by @RestController 
		return topicservice.getTopics() ;
	}
	
	
	
	@RequestMapping("topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}

	
	@RequestMapping(value="topics",
					method=RequestMethod.POST)
	public Topic addTopic(@RequestBody Topic topic) {
		return topicservice.addTopic(topic);
	}
	
	
	@RequestMapping(value="topics/{id}",
					method=RequestMethod.PUT)
	public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		return topicservice.updateTopic(topic);
	}
	
	
	@RequestMapping(value="topics/{id}",
			method=RequestMethod.DELETE)
	public Topic deleteTopic(@PathVariable String id) {
		return topicservice.deleteTopic(id);
	}
}
