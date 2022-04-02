package com.sterling.apps.services;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sterling.apps.model.Person;
import com.sterling.apps.repository.PeopleRepository;

@Service
public class PeopleService implements InitializingBean {
  
@Autowired
  PeopleRepository people;



  public List<Person> getPeople(){
	  return people.findAll();
  }
  
  
  public void addPeople(Person person) {
	  people.save(person);
  }

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	 System.out.println("Class Name"+people.getClass());
}
}
