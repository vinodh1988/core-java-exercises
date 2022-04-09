package com.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstRest {
  
	@RequestMapping("/greet")
	public String hello() {
		return "This Spring boot API is working...Registered with Eureka--SecondInstance!!!!";
	}
}
