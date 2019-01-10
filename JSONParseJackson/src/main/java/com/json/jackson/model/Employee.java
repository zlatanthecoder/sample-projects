package com.json.jackson.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	@JsonProperty("id") // json property name
	private int empId;

	private String name;
	private boolean permanent;
	private Address address; // mapping JSON object to Java object

	@JsonProperty("phoneNumbers")
	private long[] phoneNo;

	private String role;
	private List<String> cities;
	private Map<String, String> properties; // mapping a JSON object to Map object

	public Address getAddress() {
		return address;
	}

	public List<String> getCities() {
		return cities;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public long[] getPhoneNo() {
		return phoneNo;
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	public String getRole() {
		return role;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public void setPhoneNo(long[] phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("***** Employee Details *****\n");
		sb.append("ID="+getEmpId()+"\n");
		sb.append("Name="+getName()+"\n");
		sb.append("Permanent="+isPermanent()+"\n");
		sb.append("Role="+getRole()+"\n");
		sb.append("Phone Numbers="+Arrays.toString(getPhoneNo())+"\n");
		sb.append("Address="+getAddress()+"\n");
		sb.append("Cities="+Arrays.toString(getCities().toArray())+"\n");
		sb.append("Properties="+getProperties()+"\n");
		sb.append("*****************************");
		
		return sb.toString();
	}

}
