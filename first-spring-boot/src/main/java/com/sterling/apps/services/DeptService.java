package com.sterling.apps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sterling.apps.model.Dept;
import com.sterling.apps.repository.DeptRepository;

@Service
public class DeptService {
	
	@Autowired
	  DeptRepository dept;

	public List<Dept> getDepts(){
		 return dept.findAll();
	}
}
