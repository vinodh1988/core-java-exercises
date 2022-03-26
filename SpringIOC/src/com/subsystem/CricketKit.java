package com.subsystem;

import org.springframework.stereotype.Component;

@Component
public class CricketKit implements Purchase{

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Buying a cricket kit");
	}

}
