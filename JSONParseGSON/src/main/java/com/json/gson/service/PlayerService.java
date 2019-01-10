package com.json.gson.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import com.json.gson.model.Address;
import com.json.gson.model.Player;

public class PlayerService {

	public static Player getPlayer() {
		Player player = new Player();
		player.setShirtNo(1);
		player.setName("David De Gea");
		player.setRetired(false);
		
		Address add = new Address();
		add.setCity("Spain");
		add.setStreet("Madrid Street");
		add.setZipcode(284003);
		player.setAddress(add);
		
		player.setPhoneNumbers(new long[] {987654, 123456, 987123});
		player.setRole("GoalKeeper");

		player.setClubs(Arrays.asList("Atletico Madrid", "Manchester United"));
		
/*		Disadvantages of below approach
        1) It creates a new class every time you use this pattern to initialize HashMap.
		2)It holds a hidden reference of the enclosing instance, which may cause the memory leak in Java application.

  		player.setGoals(new HashMap<String, Integer>(){
			{
				put("club",100);
				put("country",20);
				put("total",120);
			}
		});
*/		

/*		initialize Map object using Java8 but this approach will also caused memory leaks
		player.setGoals(Stream.of(new Object[][] {
			{"club", 100}, {"country", 20}, {"total", 120} })
			.collect(Collectors.toMap(key->(String)key[0], value->(Integer)value[1])) );				
*/
		
		//Best way to initialize Map object directly using Java8
		// https://www.baeldung.com/java-initialize-hashmap
		player.setGoals(Stream.of(
				new AbstractMap.SimpleEntry<String, Integer>("club", 100),
				new AbstractMap.SimpleEntry<>("country",20),
				new AbstractMap.SimpleEntry<>("total", 120)
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
		
		return player;
	}
	
	
	
	
	//********JSON File to JAVA Object Conversion *********
	public static Player getJAVAObjectFromJSONFile() throws IOException {
		//Get GSON object
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//read JSON file data as String
		String jsonData = new String(Files.readAllBytes(Paths.get("src/main/resources/json/zlatan.json"))); //public static byte[] readAllBytes(Path path)  throws IOException
		
		//getting Java Object fromJson() 
		Player player = gson.fromJson(jsonData, Player.class); //parse JSON String to Java Object
		
		return player;
	}
	
	
	
	
	//********JAVA Object to JSON String*********
	public static String getJSONStringFromJAVAObject(Player player) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//Java Object toJson() String
		return gson.toJson(player); //returning JSON in String format
	}
	
	
	
	
	//********* JAVA Object to JSON File********
	public static void generateJSONFileFromJAVAObject(Player player) throws IOException {
		
		/*
		 * A shortcut for writing Java Object to a JSON File is convert that Java Object to JSON String using toJson(player) method & then
		 * pass that JSON string directly to the out.write(jsonStr)
		 *  String jsonStr = gson.toJson(player);
		 *  writer.write(jsonStr);
		 */
		
		//intialize a writer for writing to a Console
		//OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		 //for writing to a file
		 FileWriter out = new FileWriter(new File("src/main/resources/json/DavidDeGea.json"));
		
		JsonWriter writer = new JsonWriter(out);
		
		//set indentation for pretty print
		writer.setIndent("\t");
		
		//start writing
		writer.beginObject(); //{
		
		writer.name("shirtNumber").value(player.getShirtNo()); // "shirtNumber": 1
		writer.name("name").value(player.getName()); // "name": "David De Gea"
		writer.name("retired").value(player.isRetired()); // "retired": false

		//writing JSON Object which is a Java Object
		writer.name("address").beginObject(); // "address": {
			writer.name("street").value(player.getAddress().getStreet()); // "street": "Madrid Street"
			writer.name("city").value(player.getAddress().getCity()); // "city": "Spain"
			writer.name("zipcode").value(player.getAddress().getZipcode()); // "zipcode": 284003
		writer.endObject(); // }

		//writing Array
		writer.name("phoneNumbers").beginArray(); // "phoneNumbers": [
			for(long phno : player.getPhoneNumbers())
				writer.value(phno); // 987654, 123456, 987123
		writer.endArray(); // ]
		
		
		writer.name("role").value(player.getRole()); // "role": "GoalKeeper"

		//writing Array
		writer.name("clubs").beginArray(); // "clubs": [
			for(String club : player.getClubs())
				writer.value(club); // "Atletico Madrid", "Manchester United"
		writer.endArray(); // ]
		
		
		//writing JSON Object which is a Map object
		writer.name("goals").beginObject(); // "goals": {
			Set<String> keySet = player.getGoals().keySet();
			for(String key : keySet)
				writer.name(key).value(player.getGoals().get(key)); // "country": 20, "total": 120, "club": 100
		writer.endObject(); // }
		
		writer.endObject(); //}
		
		writer.flush();
		writer.close();
	}
	
}
