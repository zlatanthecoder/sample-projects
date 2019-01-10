package com.json.gson.main;

import java.io.IOException;
import java.util.Arrays;

import com.json.gson.model.Player;
import com.json.gson.service.PlayerService;

public class PlayerJsonGsonMain {

	public static void main(String[] args) throws IOException {				
		
		System.out.println("---------JSON FIle to Java Object----------");
		System.out.println();
		
			Player zlatan = PlayerService.getJAVAObjectFromJSONFile();
			
		System.out.println(zlatan);
		System.out.println();
		System.out.println(zlatan.getAddress()); //return the Address class object Address [street=Sweden Street, city=Sweden, zipcode=201301]
		System.out.println(zlatan.getAddress().getCity()); //returns the city value from Address object i.e. Sweden

		System.out.println(zlatan.getPhoneNumbers()); //return Array object [J@14514713
		System.out.println(Arrays.toString(zlatan.getPhoneNumbers())); //return Array object in String format i.e. [123, 456, 789]
		System.out.println(zlatan.getPhoneNumbers()[1]); //returns value present at index 1 i.e. 456

		System.out.println(zlatan.getGoals()); //returns Map object. {club=400, country=100, total=500}
		System.out.println(zlatan.getClubs()); //return the List object i.e. [Manchester United, LA Galaxy, Barcelona, Intermilan, PSG, Juventus]
		
		
		Player goalie = PlayerService.getPlayer();
		
		System.out.println("\n---------Java Object to JSON String----------");
			String jsonStr = PlayerService.getJSONStringFromJAVAObject(goalie);			
		
		System.out.println("\n"+jsonStr);
		
		
		PlayerService.generateJSONFileFromJAVAObject(goalie);
		
	}
	
	


}
