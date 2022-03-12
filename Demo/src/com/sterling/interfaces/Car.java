package com.sterling.interfaces;

public class Car implements Fuel {
    public void carMethod() {
    	System.out.println("Car's own method");
    }

	@Override
	public void fillFuel() {
		// TODO Auto-generated method stub
		System.out.println("Car filled with fuel");
	}
}
