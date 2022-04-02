package com.sterling.apps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sterling.apps.model.Dept;
import com.sterling.apps.repository.DeptRepository;
import com.sterling.utilities.RecordAlreadyExistsException;

@Service
public class DeptService {
	
	@Autowired
	  DeptRepository repo;

	public List<Dept> getDepts(){
		 return repo.findAll();
	}
	
	 public void addDept(Dept dept)  throws RecordAlreadyExistsException{
		    Dept d  = repo.findByDeptno(dept.getDeptno());
		 if(d==null)
		  repo.save(dept);
		 else
			throw new RecordAlreadyExistsException();
	  }
}
