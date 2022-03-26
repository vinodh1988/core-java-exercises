package com.sterling.apps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sterling.apps.services.DataService;

@Controller
public class FirstController {
	
@Autowired
private DataService data;

	{
		System.out.println("First Controller is created");
	}

	@RequestMapping("/hello.do")
	public String doIt(ModelMap map) {
		map.addAttribute("people",data.names());
		return "home";
	}
	@RequestMapping("/greet.do")
	public String dothis() {
		return "sample";
	}

}