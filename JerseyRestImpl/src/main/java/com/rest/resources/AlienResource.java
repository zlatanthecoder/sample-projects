package com.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.models.Alien;
import com.rest.repository.AlienRepository;

@Path("aliens") //exposing Alien resource to this path http://localhost:8080/JerseyRestImpl/restapi/aliens
public class AlienResource { //resource also means controllers

	AlienRepository alienRepo = new AlienRepository();
	
	@GET //for any GET request to aliens resource, call this method
	//@Produces(MediaType.APPLICATION_XML) //return data in XML format which needs to be map in model class by @XmlRootElement annotation
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) //in postman Headers section mention the MediaType you want Key=Accept  Value= application/json for JSON response & Value=application/xml for XML response
	//we use @Produces when we want to send from Server to Client 
	public List<Alien> getAliens() {
		//http://localhost:8080/JerseyRestImpl/restapi/aliens/
		
	  return alienRepo.getAliens();  //fetching data from mock db
	}

	
	@Path("add")
	@POST //to add into the DB	
//	@Consumes(MediaType.APPLICATION_JSON) //here we are restricting Client(here it is postman) to send the data to the server only in JSON format. if client send in XML then error will come HTTP Status 415 – Unsupported Media Type
	//we use @Consumes when Client send some data to Server. it means what type of data server wants to accepts 
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Alien createAlien(Alien alien) {
		//http://localhost:8080/JerseyRestImpl/restapi/aliens/add
		
		alienRepo.createAlien(alien);
		return alien;
	}
	
	
	@Path("{id}")
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("id") int id) {
		//http://localhost:8080/JerseyRestImpl/restapi/aliens/1
		return alienRepo.getAlien(id);
	}
	
	
	@Path("update")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Alien updateAlien(Alien alien) {
		//http://localhost:8080/JerseyRestImpl/restapi/aliens/update
		
		/*if the resource is not available then it will not create that resource
		alienRepo.updateAlien(alien); */
		
		//code for creating resource if that resource is not available
		if(alienRepo.getAlien(alien.getId())==null) 
			alienRepo.createAlien(alien);
		else
			alienRepo.updateAlien(alien);

		return alien;
	}
	
	
	@Path("kill/{id}")
	@DELETE
	public void deleteAlien(@PathParam("id") int id) {
		//http://localhost:8080/JerseyRestImpl/restapi/aliens/kill/5
		
		alienRepo.deleteAlien(id);
	}
	
}
