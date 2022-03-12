package com.sterling.interfaces;

public class Car extends Vehicle {
	Car(){
		super("Car");
	}
    public void method() {
    	System.out.println("Car's own method");
    }

	@Override
	public void fillFuel() {
		// TODO Auto-generated method stub
		System.out.println("Car filled with fuel");
	}
}
