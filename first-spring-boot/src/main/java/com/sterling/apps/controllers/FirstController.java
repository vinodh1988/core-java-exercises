package com.sterling.apps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	{
		System.out.println("First Controller is created");
	}

	@RequestMapping("/hello.do")
	public String doIt() {
		return "home";
	}

}
