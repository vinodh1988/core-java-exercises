package com.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.subsystem.Purchase;

public class Play implements Task{

@Autowired
private Purchase kit; //autowiring by type - if only one implementaion for interface
                      //autowiring by name - if multiple implementations for interface

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Playing.....");
		kit.buy();
	}

}
