package com.system;

public class Cook implements Task{
	{
		System.out.println("Cook is about to be instantiated completly");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Cooking......");
	}

}
