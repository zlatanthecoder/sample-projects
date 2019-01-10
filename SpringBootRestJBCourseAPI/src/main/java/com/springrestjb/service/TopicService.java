package com.springrestjb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestjb.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Javascript", "Javascript Description")				
			));
	
	public List<Topic> getTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get(); //topics.stream().filter(t->t.getId().equals(id)).collect(Collectors.toList()).get(0);
		//if you know that your object will be in the 1st position then use findFirst() method + get() method
	}

	public Topic addTopic(Topic topic) {
		topics.add(topic);
		return topic;
	}


	public Topic updateTopic(String id, Topic newtopic) {
		for(int i=0; i<topics.size(); i++) {	
			Topic oldtopic = topics.get(i);
			if(oldtopic.getId().equals(id))
				topics.set(i, newtopic);
		}
		return newtopic;
	}

	public Topic deleteTopic(String id) {
		Topic topic = getTopic(id);
		topics.removeIf(t->t.getId().equals(id));
		return topic;
	}
}
