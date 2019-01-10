package com.rest.JerseyRestImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("aliens")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET //this means whenever we send a GET request to this class then this method should be executed
    @Produces(MediaType.TEXT_PLAIN) //whenever you are returning data you have to mentioned what type should be returned
    public String getIt() {
        return "Got it!";
    }

/*  @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String gotIt() {  //adding this method with the same annotation will result in ambiguity so we will get error
    	return "Get it!";
    }*/
}
