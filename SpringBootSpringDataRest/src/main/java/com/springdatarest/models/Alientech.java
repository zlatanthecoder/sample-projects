package com.springdatarest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alientech {

	@Id
	@GeneratedValue // auto generate values starting from 1. MySql 8.0 version dont support Auto generate id so using H2 DB
	private int id;
	private String name;
	private String tech;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTech() {
		return tech;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "AlienTech [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}

}
