package com.json.jackson.model;

public class Address {

	//Address class corresponds to the inner object in the root json data
	
	private String street;
	private String city;
	private int zipcode;

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return getStreet() + ", "+getCity()+", "+getZipcode();
	}

}
