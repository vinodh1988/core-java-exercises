package com.sterling.apps.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sterling.apps.model.Person;

@Service
public class DataService {
  Person []p = {
	  new Person(1,"Raj","Chennai"),
	  new Person(2,"Ravi","Mumbai"),
	  new Person(3,"Jack","Indore")
  };
  
	 public String[] names() {
		 return new String[] {"Raj","Ravi","Roger","Raghav","Joseph"};
	 }
	 
	 public Person[] getPeople() {
		  return p;
	 }
}
