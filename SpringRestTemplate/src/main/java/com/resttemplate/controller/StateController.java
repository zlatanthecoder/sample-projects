package com.resttemplate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.resttemplate.model.StateResponse;

@RestController
public class StateController {

	private static final Logger log = LoggerFactory.getLogger(StateController.class);
	
	//@Autowired
	private RestTemplate restTemplate = new RestTemplate();
	
	
	@RequestMapping("state/{stateCode}")
	public StateResponse getState(@PathVariable("stateCode") String stateCode) {
		//http://localhost:8080/state/MP
		/*
		 * RestTemplate class will use it (via a message converter e.g. HttpMessageConverter to convert the incoming JSON response into a Result object.
		 * https://www.baeldung.com/rest-template
		 */
		
		String serviceURL="http://services.groupkt.com/state/get/IND/"+stateCode;
		
		return restTemplate.getForObject(serviceURL, StateResponse.class);
	}
}
