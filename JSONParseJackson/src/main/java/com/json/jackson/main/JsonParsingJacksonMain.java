package com.json.jackson.main;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.jackson.service.ParsingService;

public class JsonParsingJacksonMain {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		System.out.println(ParsingService.convertJSONtoJavaObject(objectMapper));

		ParsingService.convertJavaObjectToJSON(objectMapper);		
		
		//getting individual keys value from json
		System.out.println("test.json title value::" + ParsingService.getJsonNode("title", objectMapper));
		
		
		// Creating Java List from JSON Array
		ParsingService.convertJSONArrayToJAVAObject(objectMapper).forEach(System.out :: println);
		
		
		//Creating Java Map from JSON
		ParsingService.convertJSONobjectToMAP(objectMapper).forEach((k,v)-> System.out.println(k + "::" + v));
	}

}
