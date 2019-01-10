package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
//@EnableDiscoveryClient
@SpringBootApplication
public class MsEdgeZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEdgeZuulApplication.class, args);

	
		/*
		 * The path for accessing the state api are
		 * http://localhost:9000/stateapi/state/{stateCode}/capital
		 * http://localhost:9000/stateapi/state/{stateCode}
		 */
	
	}

}

