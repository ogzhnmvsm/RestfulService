package com.mycompany.restfulwebservice.client;

import com.mycompany.restfulwebservice.pojo.Person;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mevsim
 */
public class ClientClassExample {
    
    public static void main(String [] args){
        ClientClassExample clientClassExample = new ClientClassExample();
        clientClassExample.postAValueInJSON();
    }
    
    public void postAValueInXML(){
        
    }
    
    public void postAValueInJSON(){
        Person person = new Person();
        person.setName("Furkan");
        person.setSurname("Sekerci");
        person.setCity("Zonguldak");
        person.setCountry("Turkiye");
        
        String link = "http://localhost:8084/RestfulWebService/webservice/postExample/postAValue";
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(link);
        Response res = target.request().post(Entity.entity(person, MediaType.APPLICATION_JSON));
        
        if(res.getStatus() == 200){
            System.out.println("POST Islemi Basarili. Donen Deger :");
            System.out.println(res.readEntity(String.class));
        }else{
            System.out.println("POST Islemi Basarisiz!");
        }
    }
    
    public void postListValueInXML(){
        
    }
    
    public void postListValueInJSON(){
        
    }
}
