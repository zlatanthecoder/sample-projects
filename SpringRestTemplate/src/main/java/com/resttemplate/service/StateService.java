package com.resttemplate.service;

import org.springframework.stereotype.Service;

import com.resttemplate.model.StateResponse;

@Service
public class StateService {

	public String getCapital(StateResponse stateResponse) {
		return stateResponse.getRestResponse().getResult().getCapital();
	}
}
