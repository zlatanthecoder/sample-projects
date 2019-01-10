package com.rest.JerseyRestImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.models.Alien;

@Path("myresource") //exposing Alien resource to this path
public class AlienResource {

	@GET //for any GET request to aliens resource, call this method
	@Produces(MediaType.APPLICATION_XML) //return data in XML format which needs to be map in model class by @XmlRootElement annotation
	public Alien getAlien() {		
		Alien al = new Alien();		
		al.setPlanet("Jupiter");		
		al.setName("Alien1");		
		return al;
		
	}
}
