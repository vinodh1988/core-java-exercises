package com.subsystem;

import org.springframework.stereotype.Component;

@Component("books")
public class Books implements Purchase {
	{
		System.out.println("Books .....purchase");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Purchasing books");
	}

}
