/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.restfulwebservice.getexample;

import com.mycompany.restfulwebservice.pojo.Person;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Mevsim
 */

//Web servis olduğunu belirtme
//getExample altındaki url isteklerini burası karşılayacak
@Path("/getExample")
public class GetExampleClass {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getAValue")
    public Person getAValue(){
        Person person = new Person();
        person.setName("Oguzhan");
        person.setSurname("Mevsim");
        person.setCity("Kirklareli");
        person.setCountry("Turkiye");
        
        return person;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getListValue")
    public List<Person> getListValue(){
        List<Person> personList = new ArrayList<>();
        
        Person person = new Person();
        person.setName("Oguzhan");
        person.setSurname("Mevsim");
        person.setCity("Kirklareli");
        person.setCountry("Turkiye");
        
        Person person2 = new Person();
        person2.setName("Efe");
        person2.setSurname("Demirtas");
        person2.setCity("Giresun");
        person2.setCountry("Turkiye");
        
        Person person3 = new Person();
        person3.setName("Ugur");
        person3.setSurname("Avci");
        person3.setCity("Ordu");
        person3.setCountry("Turkey");
        
        Person person4 = new Person();
        person4.setName("Onur");
        person4.setSurname("Saritas");
        person4.setCity("Ankara");
        person4.setCountry("Turkey");
        
        Person person5 = new Person();
        person5.setName("Ahmet");
        person5.setSurname("Yavuz");
        person5.setCity("Aydin");
        person5.setCountry("Turkey");
        
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        return personList;
    }
}
