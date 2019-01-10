package com.json.gson.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/*
 Gson API supports out of the box JSON to Java Object conversion if the object field names are same as in json.
 If we want to use different name for java bean and json, then we can use @SerializedName java annotation and map the variables in JSON and Java Class.
 */

public class Player {

	@SerializedName("shirtNumber") //JSON property name(shirtNo) is different from the Java class property name(shirtNo)
	private int shirtNo;
	
	private String name;
	private boolean retired;
	
	private Address address; //binding JSON object into a java class object
	
	private long[] phoneNumbers; //binding JSON Array into Java Array Object
	
	private String role;
	
	private List<String> clubs; //binding JSON Array into List
	
	private Map<String, Integer> goals; //binding JSON object into a Map

	public int getShirtNo() {
		return shirtNo;
	}

	public void setShirtNo(int shirtNo) {
		this.shirtNo = shirtNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(long[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<String> getClubs() {
		return clubs;
	}

	public void setClubs(List<String> clubs) {
		this.clubs = clubs;
	}

	public Map<String, Integer> getGoals() {
		return goals;
	}

	public void setGoals(Map<String, Integer> goals) {
		this.goals = goals;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("***** Player Details *****\n");
		sb.append("shirtNo=" + getShirtNo() + "\n");
		sb.append("name=" + getName() + "\n");
		sb.append("retired=" + isRetired() + "\n");
		sb.append("role=" + getRole() + "\n");
		sb.append("clubs=" + getClubs() + "\n");
		sb.append("goals=" + getGoals()	+ "\n");
		sb.append("address=" + getAddress() + "\n");
		sb.append("phoneNumbers=" + Arrays.toString(getPhoneNumbers()) + "\n");
		sb.append("*****************************");
		
		return sb.toString();
	}
	
	
}
