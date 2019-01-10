package com.json.jackson.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.json.jackson.model.Employee;
import com.json.jackson.model.Topics;

public class ParsingService {
	
	/*
	 * com.fasterxml.jackson.databind.ObjectMapper is the most important class in Jackson API that provides readValue() and writeValue() methods to transform JSON to Java Object and Java Object to JSON
	 * https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial
	 * https://www.baeldung.com/jackson-object-mapper-tutorial
	 */
	

	//JSON to JAVA Object
	public static Employee convertJSONtoJavaObject(ObjectMapper objectMapper) throws JsonParseException, JsonMappingException, IOException {		

		//return objectMapper.readValue(Files.readAllBytes(Paths.get("src/main/resources/json/employee.json")), Employee.class);
		
		return objectMapper.readValue(new File("src/main/resources/json/employee.json"), Employee.class); //2nd argument is the class to which you want to convert the JSON data
		 				//  readValue()=JSON to Java Object
	}
	
	
	
	//JAVA Object to JSON
	public static void convertJavaObjectToJSON(ObjectMapper objectMapper) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		//configure object mapper for pretty print
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true); //without this data will be there in single line not in json format
		
		objectMapper.writeValue(new File("src/main/resources/json/pankaj.json"), convertJSONtoJavaObject(objectMapper));
				 // writeValue()=Java Object to JSON
	}
	
	
/*	public static Test convertJSONtoJavaObjectURL(ObjectMapper objectMapper) throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		return objectMapper.readValue(new URL("http://jsonplaceholder.typicode.com/posts/1"), Test.class);
	}*/
	
	
	//getting individual Node value
	public static String getJsonNode(String nodeName, ObjectMapper objectMapper) throws JsonProcessingException, IOException {
		JsonNode jsonNode = objectMapper.readTree(new File("src/main/resources/json/test.json"));
		
		return jsonNode.get(nodeName).asText();
	}
	
	
	
	//parsing JSON Array into Java List
	public static List<Topics> convertJSONArrayToJAVAObject(ObjectMapper objectMapper) throws JsonParseException, JsonMappingException, IOException {
		//Creating Java List from JSON Array String
		
		//return objectMapper.readValue(new File("src/main/resources/json/topics.json"), Topics.class); //we can't bind topics.json to Topics model as topics.json contains Arrays not JSON object
		
		return objectMapper.readValue(new File("src/main/resources/json/topics.json"), new TypeReference<List<Topics>>() {} );
	}
	
	
	
	//Creating Java Map from JSON
	public static Map<String, Object> convertJSONobjectToMAP(ObjectMapper objectMapper) throws JsonParseException, JsonMappingException, IOException {

		return objectMapper.readValue(new File("src/main/resources/json/error.json"), new TypeReference<Map<String, Object>>() {} );
		
	}
}
