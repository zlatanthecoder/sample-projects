package com.boot.models;

import org.springframework.stereotype.Component;

@Component
//@Component("lap1")= this will create a bean with name lap1
public class Laptop {

	private int lid;
	private String brand;

	public String getBrand() {
		return brand;
	}

	public int getLid() {
		return lid;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}

}
