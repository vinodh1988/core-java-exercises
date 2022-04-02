package com.sterling.apps.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sterling.apps.model.Dept;
import com.sterling.apps.services.DeptService;

@RestController
@RequestMapping("/api")
public class DeptApi {

	@Autowired
	  DeptService dept;
	
	@RequestMapping("/depts")
	public List<Dept> getDepts(){
		return dept.getDepts();
	}
}
