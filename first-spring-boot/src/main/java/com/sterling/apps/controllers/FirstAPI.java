package com.sterling.apps.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sterling.apps.model.Person;
import com.sterling.apps.services.DataService;
import com.sterling.apps.services.PeopleService;
import com.sterling.utilities.RecordAlreadyExistsException;

@RestController
@RequestMapping("/api")
public class FirstAPI {
	
	@Autowired
	private DataService data;
	
	@Autowired 
	private PeopleService people;
	
  @RequestMapping("/greet")
  public String sayhi() {
	  return "Hello!!! spring boot is working";
  }
  
  @RequestMapping("/people")
  public String[] people() {
	  return data.names();
  }
  
  @RequestMapping("/peopleobjects")
  public Person[] peopleob() {
	  return data.getPeople();
  }
  
  @RequestMapping("/peopleservice")
  public List<Person> getPeople(){
	  return people.getPeople();
  }
  
  @PostMapping("/peopleservice")
  public ResponseEntity<String> addPerson(@RequestBody Person person) {
	  try {
	   people.addPeople(person);
	  }
	  catch(RecordAlreadyExistsException e) {
		  return new ResponseEntity<String>("Record already exists exception",HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	  catch(Exception e) {
		  e.printStackTrace();
		  return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	return new ResponseEntity<String>("Successfully inserted",HttpStatus.CREATED);
  }
  
}
