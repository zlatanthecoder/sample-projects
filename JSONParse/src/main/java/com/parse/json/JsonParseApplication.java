package com.parse.json;

import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonParseApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JsonParseApplication.class, args);
		
		URL url = new URL("http://jsonplaceholder.typicode.com/posts/1");
		HttpURLConnection conn= (HttpURLConnection) url.openConnection();  //this conversion will help in setting the request type or checking the status of the response code
		conn.setRequestMethod("GET");
		conn.connect();
		if(conn.getResponseCode()!=200) { //response code!=200 means some error has occured
			throw new RuntimeException("HttpResponseCode::"+conn.getResponseCode());
		}
		else {
			
		}
			
	}

}

