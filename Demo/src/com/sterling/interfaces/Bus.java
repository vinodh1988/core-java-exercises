package com.sterling.interfaces;

public class Bus implements Fuel {
     public void busMethod() {
    	 System.out.println("Bus own method");
     }

	@Override
	public void fillFuel() {
		// TODO Auto-generated method stub
		System.out.println("Bus filled with fuel");
	}
}
