package com.subsystem;

import org.springframework.stereotype.Component;

@Component("books")
public class Books implements Purchase {

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Purchasing books");
	}

}
