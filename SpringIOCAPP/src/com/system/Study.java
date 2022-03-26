package com.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.subsystem.Purchase;

public class Study implements Task{

	@Autowired
	private Purchase books;
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Study..............");
		books.buy();
	}

}
