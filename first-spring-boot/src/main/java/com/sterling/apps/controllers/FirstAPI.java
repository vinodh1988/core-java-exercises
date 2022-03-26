package com.sterling.apps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sterling.apps.services.DataService;

@RestController
@RequestMapping("/api")
public class FirstAPI {
	
	@Autowired
	private DataService data;
  @RequestMapping("/greet")
  public String sayhi() {
	  return "Hello!!! spring boot is working";
  }
  
  @RequestMapping("/people")
  public String[] people() {
	  return data.names();
  }
}
