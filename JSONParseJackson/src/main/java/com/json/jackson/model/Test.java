package com.json.jackson.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Test {

	@JsonProperty("userId")
	private int uid;

	private int id;
	private String title;
	private String body;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Test [uid=" + uid + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}

}
