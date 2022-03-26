package com.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.subsystem.Purchase;

public class Study implements Task{
	
	{
		System.out.println("Study is about to be instantiated completly");
		
	}

	@Autowired
	private Purchase books;
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Study..............");
		books.buy();
	}

}
