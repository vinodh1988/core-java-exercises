package com.sterling.apps.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sterling.apps.model.Person;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
public interface PeopleAPISpecification {
	@ApiOperation(value="list of people and it is static data",response=Iterable.class)
	 public List<Person> getPeople();
   @ApiOperation(value="Add a new person into Database",response=Person.class)
	 public ResponseEntity<String> addPerson(@RequestBody Person person);
	@ApiOperation(value="Update existing person data",response=Person.class)
	 public ResponseEntity<String> updatePerson(@RequestBody Person person);
	@ApiOperation(value="Deletes person if exists",response=Iterable.class)
	 public ResponseEntity<String> deletePerson(@PathVariable Integer sno);
	
}