package com.jpa.model;

public class Alientech {

	private int aid;
	private String aname;
	private String atech;

	public int getAid() {
		return aid;
	}

	public String getAname() {
		return aname;
	}

	public String getAtech() {
		return atech;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public void setAtech(String atech) {
		this.atech = atech;
	}

	@Override
	public String toString() {
		return "Alientech [aid=" + aid + ", aname=" + aname + ", atech=" + atech + "]";
	}

}
