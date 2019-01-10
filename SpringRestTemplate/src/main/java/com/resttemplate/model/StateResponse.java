package com.resttemplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateResponse {

	@JsonProperty("RestResponse") // this annotation annotate the RestResponse field to tell the Jackson that this is the key field in the JSON document									
	private StateRestResponse restResponse;

	
	
	public StateRestResponse getRestResponse() {
		return restResponse;
	}

	public void setRestResponse(StateRestResponse restResponse) {
		this.restResponse = restResponse;
	}

	@Override
	public String toString() {
		return "StateResponse [restResponse=" + restResponse + "]";
	}

}
