package com.springdatajpa.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpa.model.Topic;
import com.springdatajpa.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired	
	private TopicRepository topicrepo;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Javascript", "Javascript Description")				
			));
	
	
	public List<Topic> getTopics() {
		return (List<Topic>)topicrepo.findAll();
	}

	
	public Topic getTopic(String id) {
		return topicrepo.findById(id).orElse(new Topic());		
	}

	public Topic addTopic(Topic topic) {
		topicrepo.save(topic);
		return topic;
	}


	public Topic updateTopic(Topic newtopic) {
		topicrepo.save(newtopic);
		return newtopic;
	}

	public Topic deleteTopic(String id) {
		Topic topic = getTopic(id);
		topicrepo.deleteById(id);
		return topic;
	}
}
