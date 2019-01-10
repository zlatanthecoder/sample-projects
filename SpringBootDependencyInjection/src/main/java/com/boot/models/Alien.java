package com.boot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*  -----@Component---
 * if we dont write this annotation then we will get NoSuchBeanDefinitionException: No qualifying bean of type 'com.boot.models.Alien' available
 * this annotation will tell spring container to make this class as a bean & store in the spring container for future use when request comes by getBean() method
 * as by default scope for every bean is singleton 
*/
@Component
@Scope("prototype") //if scope is prototype then spring will create this as a bean object when user send the request by getBean() method
public class Alien {
	
	private int id;
	private String name;
	private String planet;
	
	@Autowired  //it is connecting to the Laptop object that is created by spring container due to @Component annotation. by default it is byType
	//@Qualifier("lap1")= it will search bean byName lap1 & wire it with this variable
	private Laptop laptop;  //Alien class is dependent on Laptop

	public String getAlienLaptopBrand() {
		return laptop.getBrand();
	}

	public int getId() {
		return id;
	}

	public Laptop getLaptop() {
		return laptop;
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


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
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