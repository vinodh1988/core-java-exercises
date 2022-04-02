package com.sterling.apps.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sterling.apps.model.Dept;
import com.sterling.apps.model.Emp;
import com.sterling.apps.services.DeptService;
import com.sterling.utilities.RecordAlreadyExistsException;

@RestController
@RequestMapping("/api")
public class DeptApi {

	@Autowired
	  DeptService dept;
	
	@RequestMapping("/depts")
	public List<Dept> getDepts(){
		return dept.getDepts();
	}
	
	  @PostMapping("/depts")
	  public ResponseEntity<String> addDept(@RequestBody Dept d) {
		  try {
		   for(Emp x:d.getEmployees())
			   x.setDept(d);
		   dept.addDept(d);
		   
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
