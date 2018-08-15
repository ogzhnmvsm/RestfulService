package com.mycompany.restfulwebservice.postExample;

import com.mycompany.restfulwebservice.pojo.Person;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Mevsim
 */

@Path("/postExample")
public class PostExampleClass {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/postAValue")
    public Person postAValue(Person person){
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getCity());
        
        return person;
    }
}
