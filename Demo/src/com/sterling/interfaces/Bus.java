package com.sterling.interfaces;

public class Bus extends Vehicle implements Fuel {
	Bus(){
		super("Bus");
	}
     public void method() {
    	 System.out.println("Bus own method");
     }

	@Override
	public void fillFuel() {
		// TODO Auto-generated method stub
		System.out.println("Bus filled with fuel");
	}
}
