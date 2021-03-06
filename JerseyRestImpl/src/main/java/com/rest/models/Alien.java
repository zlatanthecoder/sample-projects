package com.rest.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // it tells that if data of this class to be returned in xml then the root element is Alien
				
public class Alien {

	private int id;
	private String name;
	private String planet;	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPlanet() {
		return planet;
	}

	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", planet=" + planet + "]";
	}
	

}
