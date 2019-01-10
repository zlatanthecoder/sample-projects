package com.web.service;

public class LoginService {

	public boolean checkUser(String uname, String pass) {
		
		return uname.equalsIgnoreCase("admin") && pass.equals("admin")? successful(): !successful(); 
	}
	
	boolean successful() {
		return true;
	}
}
