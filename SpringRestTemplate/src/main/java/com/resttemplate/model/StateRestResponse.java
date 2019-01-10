package com.resttemplate.model;

import java.util.List;

public class StateRestResponse {

	private List<String> messages; //JSON Array to Java List object
	
	private StateResult result; //binding JSON object to Java class Object
	
	

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public StateResult getResult() {
		return result;
	}

	public void setResult(StateResult result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "StateRestResponse [messages=" + messages + ", result=" + result + "]";
	}
	
	
}
