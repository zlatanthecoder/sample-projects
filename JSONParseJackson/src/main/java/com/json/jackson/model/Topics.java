package com.json.jackson.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Topics {

	@JsonProperty("id")
	private String topicId;

	private String name;
	private String description;

	@Override
	public String toString() {
		return "Topics [topicId=" + topicId + ", name=" + name + ", description=" + description + "]";
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
