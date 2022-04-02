package com.sterling.apps.services;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sterling.apps.model.Person;
import com.sterling.apps.repository.PeopleRepository;
import com.sterling.utilities.RecordAlreadyExistsException;
import com.sterling.utilities.RecordNotExistsException;

@Service
public class PeopleService implements InitializingBean {
  
@Autowired
  PeopleRepository people;



  public List<Person> getPeople(){
	  return people.findAll();
  }
  
  
  public void addPeople(Person person)  throws RecordAlreadyExistsException{
	 Person p= people.findBySno(person.getSno());
	 if(p==null)
	  people.save(person);
	 else
		throw new RecordAlreadyExistsException();
  }
  
 

  public void  updatePeople(Person person)  throws RecordNotExistsException{
	 Person p= people.findBySno(person.getSno());
	 if(p!=null)
	  people.save(person);
	 else
		throw new RecordNotExistsException();
  }
  
  public void  deletePeople(int sno)  throws RecordNotExistsException{
	 Person p= people.findBySno(sno);
	 if(p!=null)
	  people.delete(p);
	 else
		throw new RecordNotExistsException();
  }



@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	 System.out.println("Class Name"+people.getClass());
}
}
