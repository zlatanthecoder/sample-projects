package com.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springdatarest.models.Alientech;

@RepositoryRestResource(collectionResourceRel="aliens", path="alientech") //http://localhost:8080/alientech
public interface AlientechRepository extends JpaRepository<Alientech, Integer> {

	/* GET Request
	 * http://localhost:8080/alientech
	 * http://localhost:8080/alientech/2
	 */
	
	
	/* DELETE Request
	 * http://localhost:8080/alientech/2
	 */
	
	
	/* POST Request 
	 * http://localhost:8080/alientech
	{
    	"name": "Alien1",
    	"tech": "Java",
    	"_links": {
        	"self": {
            	"href": "http://localhost:8080/alientech/1"
        	},
        	"alientech": {
            	"href": "http://localhost:8080/alientech/1"
        	}
    	}
	}
	 */
	
	
	/* PUT Request
	 * http://localhost:8080/alientech/2
	 	{
    	"name": "Alien2",
    	"tech": "C#",
    	"_links": {
        	"self": {
            	"href": "http://localhost:8080/alientech/2"
        	},
        	"alientech": {
            	"href": "http://localhost:8080/alientech/2"
        	}
    	}
	}
	 */
	
}
