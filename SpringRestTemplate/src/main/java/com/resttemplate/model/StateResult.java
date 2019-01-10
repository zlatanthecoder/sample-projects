package com.resttemplate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) //class level jackson annotation indicate that any properties not bound in any of model classes e.g. RestResponse or Result should be ignored.
public class StateResult {

	private int id;
	private String country;
	private String name;

	@JsonProperty("abbr")
	private String abbreviation;

	private String area;
	
	@JsonProperty("largest_city")
	private String largestCity;
	
	private String capital;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLargestCity() {
		return largestCity;
	}

	public void setLargestCity(String largestCity) {
		this.largestCity = largestCity;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "StateResult [id=" + id + ", country=" + country + ", name=" + name + ", abbreviation=" + abbreviation
				+ ", area=" + area + ", largestCity=" + largestCity + ", capital=" + capital + "]";
	}
	

}
