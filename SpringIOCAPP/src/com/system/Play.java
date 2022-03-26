package com.system;

import com.subsystem.Purchase;

public class Play implements Task{

private Purchase kit;

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Playing.....");
		kit.buy();
	}

}
